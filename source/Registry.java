
import java.util.Map;
import java.util.HashMap;

/**
 * This class holds a map of houses that maps the address of a house to a house object
 * It provides methods to parse input data and to output the adults from all houses in the registry
 * 
 */
public class Registry {
    Map<String, House> registry = new HashMap<>();
    
    /**
     * Default Constructor
     */
    public Registry(){}

    /**
     *
     * @param line line from text file
     */
    public void parseLine(String line){
        String[] info = line.split("\"");
        if(info.length != 12) {
            System.out.println("Input line does not match expected input. Information has not been added to the " +
                    "registry.");
            return;
        }
        String firstName = info[1];
        String lastName = info[3];
        String street = info[5];
        String city = info[7];
        String state = info[9];
        String ageText = info[11];
        parseData(firstName, lastName, street, city, state, ageText);
    }

    /**
     * this function takes in the input data and checks to see if the house exists.
     * if the house exists the person is added to it.
     * if not the house is added to the registry and the person is added to it
     * 
     * @param firstName first name of the person from input
     * @param lastName last name of the person from input
     * @param street the street of the persons residence
     * @param city the city of the persons residence
     * @param state the state of the persons residence
     * @param ageText the age of the person
     */
    public void parseData(String firstName, String lastName, String street, String city, String state, String ageText){
        street = street.toUpperCase().replaceAll("[.,;]", "").trim();
        city = city.toUpperCase();
        state= state.toUpperCase();
        int age = Integer.parseInt(ageText);
        if(registry.containsKey(street+city+state)){
            registry.get(street+city+state).addPerson(firstName, lastName, age);
        } else {
            registry.put(street+city+state, new House(street, state, city, firstName, lastName, age));
        }
    }

    /**
     * Prints the list of houses and adults from the houses in the registry
     */
    public void getAdultsFromRegistry(){
        for(Map.Entry<String, House> house: this.registry.entrySet()){
            System.out.println(house.getValue().getAdults());
        }
    }
}
