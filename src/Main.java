import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CleanStrikePlayer p1 = new CleanStrikePlayer("john",0);
        CleanStrikePlayer p2 = new CleanStrikePlayer("jim",0);

        ArrayList<Player> players= new ArrayList<>();
        players.add(p1);
        players.add(p2);

        ArrayList<PlayableTurn> turns = new ArrayList<>();

        Strike strike = new Strike();
        MultiStrike multiStrike= new MultiStrike();
        NoStrike noStrike = new NoStrike();
        StrikerStrike strikerStrike = new StrikerStrike();
        RedStrike redStrike = new RedStrike();
        DefunctCoin defunctCoin = new DefunctCoin();

        turns.add(strike);
        turns.add(noStrike);
        turns.add(multiStrike);
        turns.add(strikerStrike);
        turns.add(redStrike);
        turns.add(defunctCoin);


        CleanStrike game = new CleanStrike(9,players,turns);
        game.playGame();
    }
}
