import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup(){
        passenger = new Passenger("David", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("David", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(1, passenger.getBags());
    }


}
