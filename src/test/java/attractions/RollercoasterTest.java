package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40) ;
        visitor = new Visitor(16, 1.8, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasBouncer(){
        assertEquals(true, rollerCoaster.isAllowed(visitor));
    }

    @Test
    public void getCost(){ assertEquals(8.40, rollerCoaster.defaultPrice(),0.1);}

    @Test
    public void normalPrice(){ assertEquals(8.40, rollerCoaster.priceFor(visitor),0.1);}
}
