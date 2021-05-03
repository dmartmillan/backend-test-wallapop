package marsrover.direction;

import marsrover.Rover;

public class EastDirection implements Direction{
    @Override
    public Direction turnRight() {
        return new SouthDirection();
    }

    @Override
    public Direction turnLeft() {
        return new NorthDirection();
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
