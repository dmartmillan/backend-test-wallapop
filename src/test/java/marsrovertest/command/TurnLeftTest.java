package marsrovertest.command;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.command.TurnLeftCommand;
import marsrover.direction.NorthDirection;
import marsrover.direction.WestDirection;
import marsrovertest.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TurnLeftTest extends BaseTest {

    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV, obstacles);
        direction = new NorthDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
        command = new TurnLeftCommand();
    }

    @Test
    public void executeCommand() {
        command.execute(rover);
        assertEquals(WestDirection.class, rover.getRoverDirection().getClass());
    }
}
