package marsrover.direction;

import marsrover.Rover;

public interface Direction {
    Direction turnRight();

    Direction turnLeft();

    void moveForward(Rover rover);

    void moveBackward(Rover rover);
}
