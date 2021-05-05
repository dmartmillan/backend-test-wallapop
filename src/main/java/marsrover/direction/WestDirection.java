package marsrover.direction;

import marsrover.Rover;
import marsrover.interaction.EnumMessage;

public class WestDirection implements Direction{
    @Override
    public Direction turnRight() {
        return new NorthDirection();
    }

    @Override
    public Direction turnLeft() {
        return new SouthDirection();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() - 1);
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.setCoordinateX(rover.getCoordinateX() + 1);
    }
}
