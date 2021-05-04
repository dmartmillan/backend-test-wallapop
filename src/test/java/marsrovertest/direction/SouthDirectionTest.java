package marsrovertest.direction;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.direction.EastDirection;
import marsrover.direction.SouthDirection;
import marsrover.direction.WestDirection;
import marsrovertest.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SouthDirectionTest extends BaseTest {

    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV);
        direction = new SouthDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
    }

    @Test
    public void fromSouthTurnRight() {
        assertEquals(WestDirection.class, direction.turnRight().getClass());
    }

    @Test
    public void fromSouthTurnLeft() {
        assertEquals(EastDirection.class, direction.turnLeft().getClass());
    }

    @Test
    public void fromSouthMoveForward() {
        direction.moveForward(rover);
        assertEquals(coordinateY - 1, rover.getCoordinateY());
    }

    @Test
    public void fromSouthMoveBackward() {
        direction.moveBackward(rover);
        assertEquals(coordinateY + 1, rover.getCoordinateY());
    }
}
