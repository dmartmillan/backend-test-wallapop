import marsrover.Mars;
import marsrover.Rover;
import marsrover.command.Command;
import marsrover.direction.Direction;

public class BaseTest {
    Mars mars = new Mars(10, 10);
    int coordinateX = 5;
    int coordinateY = 5;
    Direction direction;
    Rover rover;
    Command command;
}
