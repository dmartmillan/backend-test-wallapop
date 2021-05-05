package marsrovertest.command;

import marsrover.Mars;
import marsrover.Rover;
import marsrover.command.TurnRightCommand;
import marsrover.direction.EastDirection;
import marsrover.direction.NorthDirection;
import marsrover.direction.WestDirection;
import marsrovertest.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TurnRightTest extends BaseTest {

    public Mars mars;
    public Rover rover;

    @Before
    public void setUp() {
        mars = new Mars(sizeH, sizeV, obstacles);
        direction = new NorthDirection();
        rover = new Rover(mars, coordinateX, coordinateY, direction);
        command = new TurnRightCommand();
    }

    @Test
    public void executeCommand() {
        command.execute(rover);
        assertEquals(EastDirection.class, rover.getRoverDirection().getClass());
    }
}
