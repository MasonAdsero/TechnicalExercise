/**
 * Similar to registry we are going mainly for code coverage. In a more extensive application we would want to use
 * mocking and various other testing tools to verify code functionality.
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    House house;

    @BeforeEach
    void setUp() {
        house = new House("123 MAIN ST.", "WA", "SEATTLE", "Bob", "Smith", 43);
    }

    @Test
    @DisplayName("Test adding person to household")
    void addPerson() {
        house.addPerson("Carol", "Smith", 90);
    }

    @Test
    @DisplayName("returnAddr returns the correct string")
    void returnAddr() {
        assertEquals("123 MAIN ST., SEATTLE, WA. Total Occupents: 1\n", house.returnAddr());
    }

    @Test
    @DisplayName("Ensure correct adults string returned")
    void getAdults() {
        assertEquals("123 MAIN ST., SEATTLE, WA. Total Occupents: 1\n    Bob, Smith, 43\n", house.getAdults());
    }

    @Test
    @DisplayName("Assure correct street value returned")
    void getStreet() {
        assertEquals("123 MAIN ST.", house.getStreet());
    }

    @Test
    @DisplayName("Assure city is correctly returned")
    void getCity() {
        assertEquals("SEATTLE", house.getCity());
    }

    @Test
    @DisplayName("Test state is retrieved correctly")
    void getState() {
        assertEquals("WA", house.getState());
    }

    @Test
    @DisplayName("Test Street setter")
    void setStreet() {
        house.setStreet("Test");
        assertEquals("Test", house.getStreet());
    }

    @Test
    @DisplayName("Test city setter")
    void setCity() {
        house.setCity("Test");
        assertEquals("Test", house.getCity());
    }

    @Test
    @DisplayName("Test State setter")
    void setState() {
        house.setState("Test");
        assertEquals("Test", house.getState());
    }
}