package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    void setup()
    {
        passenger = new Passenger();
    }
    @Test
    void testConstructor()
    {
        passenger = new Passenger("Mr", "James Curley", "1234567891", "1468101214", 16);
        assertEquals("Mr", passenger.getTitle());
        assertEquals("James Curley", passenger.getName());
        assertEquals("1234567891", passenger.getID());
        assertEquals("1468101214", passenger.getPhone());
        assertEquals(16, passenger.getAge());
    }
//    @Test
//    void testConstructorForNegatives()
//    {
//        assertThrows(IllegalArgumentException.class, () -> new Passenger( "gr", "jam", "123456789", "14681012", 15));
//    }

    @Test
    @DisplayName("testTitle - Testing passenger title is valid (must be Mr, Mrs, or Ms)")
    void testTitle()
    {
        assertThrows(IllegalArgumentException.class, () -> new Passenger("", "James Curley", "1234567891", "1468101214", 18));
    }
    @Test
    void testName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Passenger( "Mr", "", "1234567891", "1468101214", 18));
    }
    @Test
    void testConstructorID()
    {
        assertThrows(IllegalArgumentException.class, () -> new Passenger( "Mr", "James Curley", "", "1468101214", 18));
    }
    @Test
    void testPhone()
    {
        assertThrows(IllegalArgumentException.class, () -> new Passenger( "Mr", "James Curley", "1234567891", "", 18));
    }
    @Test
    void testAge()
    {
        assertThrows(IllegalArgumentException.class, () -> new Passenger( "Mr", "James Curley", "1234567891", "1468101214", 0));
    }
}
