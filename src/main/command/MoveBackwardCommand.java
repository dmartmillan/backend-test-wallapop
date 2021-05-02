package main.command;

import main.Rover;

public class MoveBackwardCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveBackward();
    }
}
