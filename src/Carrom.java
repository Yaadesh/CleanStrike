import java.util.ArrayList;
import java.util.HashSet;

public abstract class Carrom {

    int blackCoins;
    int redCoins=1;
    int whiteCoins;
    int striker=1;
    int numberOfPlayers;
    ArrayList<PlayableTurn> turns;
    ArrayList<Player> players;

    public abstract void playGame();

}
