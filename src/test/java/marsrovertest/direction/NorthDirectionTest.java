package marsrovertest.direction;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.direction.EastDirection;
import marsrover.direction.NorthDirection;
import marsrover.direction.WestDirection;
import marsrovertest.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorthDirectionTest extends BaseTest {

    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV, obstacles);
        direction = new NorthDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
    }

    @Test
    public void fromNorthTurnRight() {
        assertEquals(EastDirection.class, direction.turnRight().getClass());
    }

    @Test
    public void fromNorthTurnLeft() {
        assertEquals(WestDirection.class, direction.turnLeft().getClass());
    }

    @Test
    public void fromNorthMoveForward() {
        direction.moveForward(rover);
        assertEquals(coordinateY + 1, rover.getCoordinateY());
    }

    @Test
    public void fromNorthMoveBackward() {
        direction.moveBackward(rover);
        assertEquals(coordinateY - 1, rover.getCoordinateY());
    }
}
