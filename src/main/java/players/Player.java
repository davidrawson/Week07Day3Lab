package players;

public abstract class Player {

    protected String name;

    public Player (String name){
        this.name = name;
    }


    public String getName() {
        return this.name;
    }
}
