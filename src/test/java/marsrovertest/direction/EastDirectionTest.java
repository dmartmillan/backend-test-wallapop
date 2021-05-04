package marsrovertest.direction;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.direction.EastDirection;
import marsrover.direction.NorthDirection;
import marsrover.direction.SouthDirection;
import marsrovertest.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EastDirectionTest extends BaseTest {

    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV);
        direction = new EastDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
    }

    @Test
    public void fromEastTurnRight() {
        assertEquals(SouthDirection.class, direction.turnRight().getClass());
    }

    @Test
    public void fromEastTurnLeft() {
        assertEquals(NorthDirection.class, direction.turnLeft().getClass());
    }

    @Test
    public void fromEastMoveForward() {
        direction.moveForward(rover);
        assertEquals(coordinateX + 1, rover.getCoordinateX());
    }

    @Test
    public void fromEastMoveBackward() {
        direction.moveBackward(rover);
        assertEquals(coordinateX - 1, rover.getCoordinateX());
    }
}
