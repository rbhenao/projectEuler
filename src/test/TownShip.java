package test;

/**
 * Created by ryan on 3/10/16.
 */
public abstract class TownShip {
    private String name;
    private int population;
    TownShip(String name,int population){
        this.name = name;
        this.population = population;
    }

    public String getName(){
        return this.name;
    }

    public int getPop(){
        return this.population;
    }
}
