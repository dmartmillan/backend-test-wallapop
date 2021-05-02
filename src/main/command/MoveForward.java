package main.command;

import main.Rover;

public class MoveForward implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
}
