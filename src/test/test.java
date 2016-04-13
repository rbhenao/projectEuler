package test;

/**
 * Created by ryan on 3/10/16.
 */
public class test {
    //public static void main(String[] args){
//        Country usa = new Country("usa","dc",
//                new State("GA",new City("Atlanta",500000), new City("Augusta", 20), new City("Blairsville", 80)),
//                new State("FL",new City("Miami",200000), new City("Orlando",2000)),
//                new State("TN",new City("Memphis",10000), new City("Nashville",8000)));

        public static void main(String [] args){

            Country USA = new Country("USA",
                    new State("Gerogia"),
                    new State("New York", new City("New York", 150), new City("Albany",200), new City("Long Island", 500)),
                    new State("Florida", new City("Miami",150)),
                    new District("Washington DC", 175),
                    new City("San Juan", 400));

            Location[] locations = USA.getLocations();

            for(Location location: locations) {
                System.out.println(location.getPopulation());
            }



            //Land[] landArr  = USA.getArrLands();
            //System.out.println(USA.getName() + " has this many lands: " + USA.getArrLands().length);

            //System.out.println(USA.getName() + " has this number of citizens: " + USA.getPopulation());



        }
}
