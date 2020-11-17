public class CleanStrikePlayer extends Player{



    public CleanStrikePlayer(String name,int point){
        this.name = name;
        this.point = point;
    }
    @Override
    public void addPoint(int point) {
        System.out.println("Adding point "+point+" to player "+this.name);
        this.point = this.point+point;
    }

    public void incrementFoulCount(){
        this.foulCount++;
    }

    public void resetFoulCount(){
        this.foulCount = 0;
    }

    public void incrementMissedPocketCount(){
        this.missedPocketCount++;
    }

    public void resetMissedPocketCount(){
        this.missedPocketCount = 0;
    }

    @Override
    public int compareTo(Object newPlayer) {
        return this.point - ((Player) newPlayer).point;
    }
}
