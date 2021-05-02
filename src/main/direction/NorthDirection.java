package main.direction;

import main.Rover;

public class NorthDirection implements Direction {
    @Override
    public Direction turnRight() {
        return new EastDirection();
    }

    @Override
    public Direction turnLeft() {
        return new WestDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() + 1);
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.setCoordinateY(rover.getCoordinateY() - 1);
    }
}
