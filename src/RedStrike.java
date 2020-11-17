public class RedStrike implements PlayableTurn{
    public void playTurn(Player player,Carrom game) {

        System.out.println("Red Strike by"+player.name);

        game.redCoins =0;

        player.addPoint(3);

    }
}
