public class Person {
    private String firstName;
    private String lastName;
    private int age;
    /**
     * Constructs a person object
     * 
     * @param firstName first name of the person
     * @param lastName last name of the person
     * @param age age of the person
     */
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Returns a string of the persons information
     * @return String of firstName lastName and age comma seperated
     */
    public String personInfo(){
        return this.firstName + ", " + this.lastName + ", " + this.age; 
    }

    //Getters
    /**
     * gets the first name attribute of a person
     * @return string of person firstName
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * gets the last name of the person
     * @return string of person lastName
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * gets the age of a person
     * @return int age of the person
     */
    public int getAge(){
        return this.age;
    }

    //Setters
    /**
     * sets the name of a person
     * @param firstName new firstName
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * sets the last name of a person
     * @param lastName new lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * sets the age of a person
     * @param age new age
     */
    public void setAge(int age){
        this.age = age;
    }
}
