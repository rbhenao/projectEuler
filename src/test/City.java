package test;

/**
 * Created by ryan on 3/10/16.
 */
public class City extends TownShip implements Location{
    City(String name, int population){
        super(name,population);
    }

    public int getPopulation(){
        return this.getPop();
    }
}
