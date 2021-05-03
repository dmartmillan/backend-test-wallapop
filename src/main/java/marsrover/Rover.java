package marsrover;

import marsrover.command.Command;
import marsrover.direction.Direction;
import marsrover.interaction.UserInteraction;

public class Rover {

    private Mars planet;
    private int coordinateX;
    private int coordinateY;
    private Direction roverDirection;

    public Rover(Mars planet, int coordinateX, int coordinateY, Direction roverDirection) {
        this.planet = planet;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.roverDirection = roverDirection;
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
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
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

    public void writePosition() {
        UserInteraction.writePosition(this.coordinateX, this.coordinateY, this.roverDirection.getClass().getSimpleName().toLowerCase().charAt(0));
    }
}