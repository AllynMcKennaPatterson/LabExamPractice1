package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessSuccessTest {
    private Business  myBusiness;

    @BeforeEach
    void setUp(){
        myBusiness = new Business("Dominos", 138943, "44 Woodlands", 900, 1800);
    }

    @Test
    void testName(String name){
        assertEquals("Dominos", myBusiness.getName());
    }

    @Test
    void testId(long id){
        assertEquals(138943, myBusiness.getId());
    }

    @Test
    void testAddress(String address){
        assertEquals("44 Woodlands", myBusiness.getAddress());
    }

    @Test
    void testOpenTime(int openTime){
        assertEquals(900, myBusiness.getOpenTime());
    }

    @Test
    void testCloseTime(int closeTime){
        assertEquals(1800, myBusiness.getCloseTime());
    }

}
