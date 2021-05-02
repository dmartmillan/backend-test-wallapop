package main.command;

import main.Rover;

public class TurnLeft implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
