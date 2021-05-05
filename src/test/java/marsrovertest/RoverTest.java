package marsrovertest;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.direction.Direction;
import marsrover.direction.EastDirection;
import marsrover.direction.NorthDirection;
import marsrover.direction.WestDirection;
import marsrover.error.EnumError;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest extends BaseTest {

    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV, obstacles);
        direction = new NorthDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
    }

    @Test
    public void roverCreationTest() {
        Direction newDirection = new NorthDirection();
        Rover newRover = new Rover(mars, coordinateX, coordinateY, newDirection);
        assertEquals(NorthDirection.class, newRover.getRoverDirection().getClass());
        assertEquals(coordinateX, newRover.getCoordinateX());
        assertEquals(coordinateY, newRover.getCoordinateY());
    }

    @Test
    public void wrongPositionRoverTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.POSITION.getError());

        rover = new Rover(mars, sizeH + 1, sizeV + 1, direction);
    }

    @Test
    public void retrieveCoordinatesTest() {
        assertEquals(coordinateX, rover.getCoordinateX());
        assertEquals(coordinateY, rover.getCoordinateY());
    }

    @Test
    public void changeCoordinatesTest() {
        int newCoordinateX = coordinateX+1;
        int newCoordinateY = coordinateY+1;
        rover.setCoordinateX(newCoordinateX);
        rover.setCoordinateY(newCoordinateY);
        assertEquals(newCoordinateX, rover.getCoordinateX());
        assertEquals(newCoordinateY, rover.getCoordinateY());
    }


    @Test
    public void moveForwardTest() {
        rover.moveForward();
        assertEquals(coordinateY + 1, rover.getCoordinateY());
    }

    @Test
    public void moveBackwardTest() {
        rover.moveBackward();
        assertEquals(coordinateY - 1, rover.getCoordinateY());
    }

    @Test
    public void turnRightTest() {
        rover.turnRight();
        assertEquals(EastDirection.class, rover.getRoverDirection().getClass());
    }

    @Test
    public void turnLeftTest() {
        rover.turnLeft();
        assertEquals(WestDirection.class, rover.getRoverDirection().getClass());
    }

    @Test
    public void writePositionTest() {
        String position = rover.toString();
        assertEquals("Rover is at x:" + coordinateX + " y:" + coordinateY + " facing:" +
                direction.getClass().getSimpleName().toLowerCase().charAt(0), position);
    }

    @Test
    public void tourVerticalMarsWhenRoversIsOverEdgeWithMoveForward() {
        for (int i = rover.getCoordinateY(); i < mars.getSizeVertical() + 1; ++i) {
            rover.moveForward();
        }
        assertEquals(0,rover.getCoordinateY());
    }

    @Test
    public void tourHorizontalMarsWhenRoversIsOverEdgeWithMoveForward() {
        rover.turnRight();
        for (int i = rover.getCoordinateX(); i < mars.getSizeHorizontal() + 1; ++i) {
            rover.moveForward();
        }
        assertEquals(0,rover.getCoordinateX());
    }

    @Test
    public void tourVerticalMarsWhenRoversIsOverEdgeWithMoveBackward() {
        for (int i = mars.getSizeVertical() - rover.getCoordinateY(); i > -1; --i) {
            rover.moveBackward();
        }
        assertEquals(mars.getSizeVertical(), rover.getCoordinateY());
    }

    @Test
    public void tourHorizontalMarsWhenRoversIsOverEdgeWithMoveBackward() {
        rover.turnRight();
        for (int i = mars.getSizeHorizontal() - rover.getCoordinateX(); i > -1; --i) {
            rover.moveBackward();
        }
        assertEquals(mars.getSizeHorizontal(), rover.getCoordinateX());
    }
}
