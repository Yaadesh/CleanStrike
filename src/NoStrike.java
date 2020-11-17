public class NoStrike implements PlayableTurn{
    public void playTurn(Player player,Carrom game) {

        System.out.println("No Strike by "+player.name);

        player.addPoint(0);
        player.incrementMissedPocketCount();



    }
}
