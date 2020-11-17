public class DefunctCoin implements PlayableTurn{
    public void playTurn(Player player,Carrom game) {

        System.out.println("DefunctCoin by "+player.name);

        if(game.blackCoins>0)
            game.blackCoins--;

        player.addPoint(-2);
        player.incrementFoulCount();


    }
}
