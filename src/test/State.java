package test;

/**
 * Created by ryan on 3/10/16.
 */
public class State implements Location{
    String name;
    City[] cities;
    State(String name, City...cities){
        this.name = name;
        this.cities = cities;
    }

    public int getPopulation(){
        int totalPopulation = 0;
        for(City city: cities) {
            totalPopulation += city.getPopulation();
        }

        return totalPopulation;
    }
}
