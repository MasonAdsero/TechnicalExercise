/*Assumptions
*   It is not necessary to implement the ability to remove people from the house
*
 * I included getters and setters for this class just for posterity.
 * City or Street names are more likely to change but it is less likely state
 * for a residence would need to be changed
 */

import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

/* The house class represents a house full of persons or people
 * It provides methods to add people to the house and retrieve adults from the house
 */
public class House {
    private Vector<Person> people = new Vector<>();
    private String street;
    private String state;
    private String city;

    /**
     * Constructs a new house object and inserts the first person into the household
     * 
     * @param street street of residence
     * @param state state of residence
     * @param city city of residence
     * @param firstName first name of first resident
     * @param lastName last name of first resident
     * @param age age of first resident
     */
    public House(String street, String state, String city, String firstName, String lastName, int age){
        this.street = street;
        this.state = state;
        this.city = city;
        addPerson(firstName, lastName, age);
    }

    /**
     * This function adds a person to a household
     * 
     * @param firstName first name of person being added to house
     * @param lastName last name of person being added to house
     * @param age age of person being added to house
     */
    public void addPerson(String firstName, String lastName, int age){
        people.add(new Person(firstName, lastName, age));
    }

    /**
     * 
     * @return The combined string address of the house and occupents number
     */
    public String returnAddr(){
        return this.street + ", " + this.city + ", " + this.state + ". Total Occupents: " + people.size() + "\n";
    }

    /**
     * 
     * @return returns the string of all the adults in the household
     */
    public String getAdults(){
        Vector<Person> adults = new Vector<>();
        for(int i = 0; i < people.size(); i++){
            if(this.people.get(i).getAge() >= 18){
                adults.add(this.people.get(i));
            }
        }
        sortHouse(adults);
        String addressAndOccupents = returnAddr();
        for(int i = 0; i < adults.size(); i++){
            addressAndOccupents += "    " + adults.get(i).personInfo() + "\n";
        }
        return addressAndOccupents;
    }

    /**
     * Sorts the list of people in a house using an overridden comparator
     * 
     * @param people the vector of people we are going to sort
     */
    private void sortHouse(Vector<Person> people){
        Collections.sort(people, new Comparator<Person>(){ 
            @Override public int compare(Person p1, Person p2) {
                int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
                if(lastNameComparison != 0){
                    return lastNameComparison;
                } else {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                }
            }
        });
    }

    //Getters
    /**
     * 
     * @return the value of street
     */
    public String getStreet(){
        return this.street;
    }

    /**
     * 
     * @return the value of city
     */
    public String getCity(){
        return this.city;
    }

    /**
     * 
     * @return the value of state
     */
    public String getState(){
        return this.state;
    }

    //Setters
    /**
     * Sets the value of street
     * @param street new value of street
     */
    public void setStreet(String street){
        this.street = street;
    }

    /**
     * Sets the value of city
     * @param city new value of city
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Sets the state
     * @param state new value of state
     */
    public void setState(String state){
        this.state = state;
    }
}
