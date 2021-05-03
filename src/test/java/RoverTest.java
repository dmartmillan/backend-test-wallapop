import marsrover.Rover;
import marsrover.direction.NorthDirection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest extends BaseTest {

    /*@Before
    public void setUp() {

    }*/

    @Test
    public void basicTest() {
        direction = new NorthDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
        rover.moveForward();
        assertEquals(NorthDirection.class, rover.getRoverDirection().getClass());
    }
}
