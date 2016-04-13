package test;
/**
 * Created by ryan on 3/10/16.
 */
public class District extends TownShip implements Location{
    District(String name, int population){
        super(name,population);
    }

    public int getPopulation(){
        return this.getPop();
    }

}
