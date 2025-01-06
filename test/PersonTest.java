/**
 * Similar to the other two test files my goal for these unit tests is coverage. You would most likely want to use
 * various testing tools to better isolate these unit test from other functions.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Bob", "Smith", 23);
    }

    @Test
    @DisplayName("Ensure info correctly returned")
    void personInfo() {
        assertEquals("Bob, Smith, 23", person.personInfo());
    }

    @Test
    @DisplayName("Test first name getter")
    void getFirstName() {
        assertEquals("Bob", person.getFirstName());
    }

    @Test
    @DisplayName("Test last name getter")
    void getLastName() {
        assertEquals("Smith", person.getLastName());
    }

    @Test
    @DisplayName("Age getter")
    void getAge() {
        assertEquals(23, person.getAge());
    }

    @Test
    @DisplayName("First name setter")
    void setFirstName() {
        person.setFirstName("Junior");
        assertEquals("Junior", person.getFirstName());
    }

    @Test
    @DisplayName("Last name setter")
    void setLastName() {
        person.setLastName("Dunn");
        assertEquals("Dunn", person.getLastName());
    }

    @Test
    @DisplayName("Age setter")
    void setAge() {
        person.setAge(43);
        assertEquals(43, person.getAge());
    }
}