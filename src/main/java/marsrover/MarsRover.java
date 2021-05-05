package marsrover;

import marsrover.command.Command;
import marsrover.command.EnumCommand;
import marsrover.direction.Direction;
import marsrover.direction.EnumDirection;
import marsrover.interaction.EnumMessage;
import marsrover.interaction.UserInteraction;

public class MarsRover {

    public static void main(String[] args) {

        int sizeH = UserInteraction.readNumber(EnumMessage.HORIZONTAL_SIZE.getMessage());
        int sizeV = UserInteraction.readNumber(EnumMessage.VERTICAL_SIZE.getMessage());
        String obstaclesList = UserInteraction.readText(EnumMessage.OBSTACLES.getMessage());

        Mars mars = new Mars(sizeH, sizeV, obstaclesList);

        int roverX = UserInteraction.readNumber(EnumMessage.POSITION_X.getMessage());
        int roverY = UserInteraction.readNumber(EnumMessage.POSITION_Y.getMessage());
        String roverDirection = UserInteraction.readText(EnumMessage.DIRECTION.getMessage());
        Direction direction = EnumDirection.valueOf(roverDirection.toUpperCase()).getDirection();

        Rover rover = new Rover(mars, roverX, roverY, direction);

        do {
            String command = UserInteraction.readText(EnumMessage.COMMAND.getMessage());
            Command commandToExecute = EnumCommand.valueOf(command.toUpperCase()).getCommand();

            rover.executeCommand(commandToExecute);

            UserInteraction.writePosition(rover.toString());
        } while (true);
    }
}
