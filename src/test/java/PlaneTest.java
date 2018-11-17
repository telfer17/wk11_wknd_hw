import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before
    public void setup(){
        plane1 = new Plane(PlaneType.CESSNA);
        plane2 = new Plane(PlaneType.AIRBUS);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.CESSNA, plane1.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, PlaneType.CESSNA.getCapacity());
    }

    @Test
    public void hasMaxWeight(){
        assertEquals(1000, PlaneType.AIRBUS.getWeight());
    }

}
