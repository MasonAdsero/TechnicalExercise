/**Important note: I chose to not include the addresses of each individual in a house hold because I used the Household
 * as the ID. What I mean is the households address is already printed above the individuals who live
 * there. For example "Dave","Smith","123 main st.","seattle","wa","43" output would be
 * 123 MAIN ST., SEATTLE, WA Total Occupents: ...
 *     Dave, Smith, 43
 * Therefore printing the address for each individual would be redundant.
 *
 * Main Assumptions
 *  All future data will conform to the data presented in the exercise ex:
 *      a street will always be abreviated to st same for any other commonly abbreviated parts of an address
 *      City will be completely written out no abreviation
 *      State will always be Abbreviated
 * 
 *  Age is always input as a valid age ie cant be -1 years old.
 * 
 *  All information is required for each person
 *   
 *  A house address will always come with a persons information. Meaning we wont add a house without a person
 * 
 *  I also left setters and getters for in the future if the functionality of changing names, ages, and
 *  addresses for homes is needed
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Registry registry = new Registry();
        Scanner scan = new Scanner(new File("./adresses.txt"));
        while(scan.hasNextLine()){
            registry.parseLine(scan.nextLine());
        }
        registry.getAdultsFromRegistry();
    }
}