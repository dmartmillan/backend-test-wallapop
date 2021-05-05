package marsrover;

import marsrover.command.Command;
import marsrover.direction.Direction;
import marsrover.error.EnumError;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rover {

    private final Mars mars;
    private int coordinateX;
    private int coordinateY;
    private Direction roverDirection;

    public Rover(Mars planet, int coordinateX, int coordinateY, Direction roverDirection) {
        this.mars = planet;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.roverDirection = roverDirection;

        this.validatePosition();
    }

    public int getCoordinateX() {
        return this.coordinateX;
    }

    public int getCoordinateY() {
        return this.coordinateY;
    }

    public Direction getRoverDirection() {
        return roverDirection;
    }

    public void setCoordinateX(int coordinateX) {
        if (coordinateX > mars.getSizeHorizontal()) {
            this.coordinateX = 0;
        } else if (coordinateX < 0) {
            this.coordinateX = mars.getSizeHorizontal();
        } else this.coordinateX = coordinateX;

        this.validatePosition();
    }

    public void setCoordinateY(int coordinateY) {
        if (coordinateY > mars.getSizeVertical()) {
            this.coordinateY = 0;
        } else if (coordinateY < 0) {
            this.coordinateY = mars.getSizeVertical();
        } else this.coordinateY = coordinateY;

        this.validatePosition();
    }

    public void executeCommand(Command command) {
        command.execute(this);
    }

    public void moveForward() {
        getRoverDirection().moveForward(this);
    }

    public void moveBackward() {
        getRoverDirection().moveBackward(this);
    }

    public void turnLeft() {
        this.roverDirection = getRoverDirection().turnLeft();
    }

    public void turnRight() {
        this.roverDirection = getRoverDirection().turnRight();
    }

    @Override
    public String toString() {
        return "Rover is at x:" + this.coordinateX + " y:" + this.coordinateY + " facing:" +
                this.roverDirection.getClass().getSimpleName().toLowerCase().charAt(0);
    }

    private void validatePosition() {
        if (coordinateX > mars.getSizeHorizontal() || coordinateY > mars.getSizeVertical()
                || coordinateY < 0 || coordinateX < 0) {
            throw new IllegalArgumentException(EnumError.POSITION.getError());
        }
    }
}
