package marsrovertest.command;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.command.MoveForwardCommand;
import marsrover.direction.NorthDirection;
import marsrovertest.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveForwardTest extends BaseTest {
    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV, obstacles);
        direction = new NorthDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
        command = new MoveForwardCommand();
    }

    @Test
    public void executeCommand() {
        command.execute(rover);
        assertEquals(coordinateY + 1, rover.getCoordinateY());
    }

}
