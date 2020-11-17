public class MultiStrike implements PlayableTurn{
    public void playTurn(Player player,Carrom game) {
        if(game.blackCoins>=1)
            game.blackCoins = game.blackCoins-2;

        System.out.println("MultiStrike by "+player.name);
        player.addPoint(2);
    }
}
