package main.direction;

import main.Rover;

public class East implements Direction{
    @Override
    public Direction turnRight() {
        return new South();
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() + 1);
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() - 1);
    }
}
