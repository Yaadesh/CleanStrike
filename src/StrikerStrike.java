public class StrikerStrike implements PlayableTurn{
    public void playTurn(Player player,Carrom game) {
        System.out.println("Striker Strike by "+player.name);

        player.addPoint(-1);
        player.incrementFoulCount();


    }
}
