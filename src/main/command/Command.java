package main.command;

import main.Rover;

public interface Command {
    void execute(Rover rover);
}
