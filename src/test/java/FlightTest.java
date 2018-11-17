import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    ArrayList<Passenger> passengers;

    @Before
    public void setup(){
        plane1 = new Plane(PlaneType.CESSNA);
        plane2 = new Plane(PlaneType.AIRBUS);
        passenger1 = new Passenger("David", 1);
        passenger2 = new Passenger("John", 2);
        passenger3 = new Passenger("Megan", 3);
        passengers = new ArrayList<Passenger>();

        flight1 = new Flight(plane1, "643", "LDN", "GLA", "12.00");
        flight2 = new Flight(plane2, "100", "LAX", "LHR", "07.00");
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.CESSNA, flight1.getPlane().getPlaneType());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("643", flight1.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("LDN", flight1.getDestination());
    }

    @Test
    public void canGetDeparture(){
        assertEquals("GLA", flight1.getDeparture());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("12.00", flight1.getDepartureTime());
    }

    @Test
    public void canGetNumberOfPassengers(){
        assertEquals(0, passengers.size());
    }

    @Test
    public void canAddPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getNumberOfPassengers());
    }

    @Test
    public void cantAddPassengers(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(2, flight1.getNumberOfPassengers());
    }

    @Test
    public void getRemainingSeats() {
        flight2.addPassenger(passenger1);
        assertEquals(99, flight2.getRemainingSeats());
    }
}
