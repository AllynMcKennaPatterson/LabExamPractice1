package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessFailTest {

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Business("Am", 12343, "44 Woodlands", 900, 1800);});
        assertEquals("Error: Name must have at least 4 characters.", exMessage.getMessage());
    }
    @Test

    void testIdFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Business("Dominos", -12343, "44 Woodlands", 900, 1800);});
        assertEquals("Error: Id must be a positive number", exMessage.getMessage());
    }

    @Test
    void testAddressFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Business("Dominos", 12343, "44 W", 900, 1800);});
        assertEquals("Error: Address must have at least 6 characters", exMessage.getMessage());
    }

    @Test
    void testOpeningTimeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Business("Dominos", 12343, "44 Woodlands", -900, 1800);});
        assertEquals("Error: Opening time must be a valid 24hr time", exMessage.getMessage());
    }

    @Test
    void testClosingTimeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->{new Business("Dominos", 12343, "44 Woodlands", 900, 2500);});
        assertEquals("Error: Closing time must be a valid 24hr time", exMessage.getMessage());
    }
}
