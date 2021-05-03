package marsrover.direction;

import marsrover.Rover;

public class SouthDirection implements Direction {

    @Override
    public Direction turnRight() {
        return new WestDirection();
    }

    @Override
    public Direction turnLeft() {
        return new EastDirection();
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
