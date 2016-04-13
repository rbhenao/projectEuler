package test;

/**
 * Created by ryan on 3/10/16.
 */
public class Country {
    String name;
    Location[] locations;
    Country(String name, Location...locations){
        this.name = name;
        this.locations = locations;
    }

    public Location[] getLocations(){
        return this.locations;
    }
}
