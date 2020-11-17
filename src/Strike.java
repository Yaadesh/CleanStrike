public class Strike implements PlayableTurn{
    public void playTurn(Player player,Carrom game) {
        System.out.println("Strike by"+player.name);

        if(game.blackCoins>0)
            game.blackCoins--;


        player.addPoint(1);

    }
}
