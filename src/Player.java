public abstract class Player implements Comparable{

    int point;
    String name;
    int foulCount=0;
    int missedPocketCount=0;

    public abstract void addPoint(int point);
    public abstract void incrementFoulCount();

    public abstract void resetFoulCount();

    public abstract void incrementMissedPocketCount();

    public abstract void resetMissedPocketCount();

}
