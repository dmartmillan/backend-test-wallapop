package marsrovertest.direction;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.direction.NorthDirection;
import marsrover.direction.SouthDirection;
import marsrover.direction.WestDirection;
import marsrovertest.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WestDirectionTest extends BaseTest {
    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV);
        direction = new WestDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
    }

    @Test
    public void fromWestTurnRight() {
        assertEquals(NorthDirection.class, direction.turnRight().getClass());
    }

    @Test
    public void fromWestTurnLeft() {
        assertEquals(SouthDirection.class, direction.turnLeft().getClass());
    }

    @Test
    public void fromWestMoveForward() {
        direction.moveForward(rover);
        assertEquals(coordinateX - 1, rover.getCoordinateX());
    }

    @Test
    public void fromWestMoveBackward() {
        direction.moveBackward(rover);
        assertEquals(coordinateX + 1, rover.getCoordinateX());
    }
}
