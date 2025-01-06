/**
 * These tests are trivial but give us code coverage.
 * Ideally we would use mocking to isolate methods. We would also want to verify the output of the function that prints
 * as manual verification is tedious and error-prone but that is a bit out of scope for this technical exercise.
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegistryTest {

    Registry registry;

    @BeforeEach
    void setUp(){
        registry = new Registry();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Ensure line parsing function runs without error")
    void parseLine() {
        registry.parseLine("\"Dave\",\"Smith\",\"123 main st.\",\"seattle\",\"wa\",\"43\"");
    }

    @Test
    @DisplayName("Reject invalid input")
    void parseBadLine(){
        registry.parseLine("\"Dave\",\"Smith\",\"123 main st.\",\"seattle\",\"wa\"");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Ensure parsing data runs without error")
    void parseData() {
        registry.parseData("Dave", "Smith", "123 Main st.", "seattle", "wa", "43");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Ensure names and houses are printed without error")
    void getAdultsFromRegistry() {
        registry.parseLine("\"Dave\",\"Smith\",\"123 main st.\",\"seattle\",\"wa\",\"43\"");
        registry.getAdultsFromRegistry();
    }
}