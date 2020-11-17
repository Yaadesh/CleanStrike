import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CleanStrike extends Carrom {

     final int MAX_FOUL_COUNT=3;
     final int MAX_MISSED_POCKET=3;
     final int FOUL_POINT_LOSS=-1;
     final int MISSED_POINT_LOSS=-1;
     final int MIN_POINT_TO_WIN=5;

     boolean gameEnd = false;

    public CleanStrike(int blackCoinCount, ArrayList<Player> players, ArrayList<PlayableTurn> turnSet){
        this.blackCoins = blackCoinCount;
        this.players = players;
        this.turns = turnSet;

        System.out.println("\n== INPUT NUMBER AND ACTION ==\n");
        for(int i=0;i<turnSet.size();i++){
            System.out.println(i+" "+turnSet.get(i).getClass());
        }
    }

    public void playGame(){
        System.out.println("\n== PLAYING GAME ==\n");
            int playerCount = 0;
        File file =
                new File("src/input.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(true && !this.gameEnd && sc.hasNext()){

                //Player plays turn

                Player currentPlayer = players.get(playerCount);
                int turnIndex = 0;


                //Player selects turn action
                    turnIndex = sc.nextInt();

                turns.get(turnIndex).playTurn(currentPlayer,this);


                if(currentPlayer.foulCount>=MAX_FOUL_COUNT){
                    System.out.println("-- Foul point reduction for "+currentPlayer.name);
                    currentPlayer.addPoint(FOUL_POINT_LOSS);
                    currentPlayer.resetFoulCount();
                }

                if(currentPlayer.missedPocketCount>=MAX_MISSED_POCKET){
                    System.out.println("-- Missed pocket point reduction for "+currentPlayer.name);
                    currentPlayer.addPoint(MISSED_POINT_LOSS);
                    currentPlayer.resetMissedPocketCount();
                }

                //Reset playerCount at end
                playerCount++;
                if(playerCount==players.size())
                    playerCount=0;

                //Checking if any winner
                gameStateCheck();
            }
        }

        private void gameStateCheck(){
            ArrayList<Player> temp = (ArrayList<Player>) players.clone();
            Collections.sort(temp);

            int finalIndex = temp.size()-1;
            if(((temp.get(finalIndex).point>(temp.get(finalIndex-1).point)+3)) && (temp.get(finalIndex).point>MIN_POINT_TO_WIN)){
                this.gameEnd = true;

                System.out.println(temp.get(finalIndex).name+" WINS !");
                return;
            }

            if(this.blackCoins<=0){
                this.gameEnd= true;
                System.out.println("GAME DRAW !");
            }

        }

}


