package marsrover.command;

import marsrover.Rover;

public class MoveBackwardCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveBackward();
    }
}
