package marsrover.command;

import marsrover.Rover;

public interface Command {
    void execute(Rover rover);
}
