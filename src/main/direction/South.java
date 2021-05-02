package main.direction;

import main.Rover;

public class South implements Direction {

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() - 1);
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() + 1);
    }
}
