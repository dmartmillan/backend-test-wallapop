import marsrover.Rover;
import marsrover.command.Command;
import marsrover.direction.Direction;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class BaseTest {
    protected int sizeH = 10;
    protected int sizeV = 10;
    protected int coordinateX = 5;
    protected int coordinateY = 5;
    protected Direction direction;
    protected Rover rover;
    protected Command command;

    @Rule
    public ExpectedException thrown = ExpectedException.none();
}
