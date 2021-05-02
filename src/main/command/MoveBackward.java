package main.command;

import main.Rover;

public class MoveBackward implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveBackward();
    }
}
