package marsrover.direction;

import marsrover.Rover;
import marsrover.interaction.EnumMessage;

public interface Direction {
    Direction turnRight();

    Direction turnLeft();

    void moveForward(Rover rover);

    void moveBackward(Rover rover);
}
