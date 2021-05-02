package main.direction;

import main.Rover;

public interface Direction {
    Direction turnRight();

    Direction turnLeft();

    void moveForward(Rover rover);

    void moveBackward(Rover rover);
}
