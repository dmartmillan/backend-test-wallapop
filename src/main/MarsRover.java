package main;

import main.direction.Direction;
import main.direction.EnumDirection;
import main.interaction.EnumMessage;
import main.interaction.UserInteraction;
import main.command.Command;
import main.command.EnumCommand;

public class MarsRover {

    public static void main(String[] args) throws Exception {

        int sizeH = UserInteraction.readNumber(EnumMessage.HORIZONTAL_SIZE.getMessage());
        int sizeV = UserInteraction.readNumber(EnumMessage.VERTICAL_SIZE.getMessage());

        Mars mars = new Mars(sizeH, sizeV);

        int roverX = UserInteraction.readNumber(EnumMessage.POSITION_X.getMessage());
        int roverY = UserInteraction.readNumber(EnumMessage.POSITION_Y.getMessage());
        String roverDirection = UserInteraction.readText(EnumMessage.DIRECTION.getMessage());
        Direction direction = EnumDirection.valueOf(roverDirection.toUpperCase()).getDirection();

        Rover rover = new Rover(mars, roverX, roverY, direction);

        do {
            String command = UserInteraction.readText(EnumMessage.COMMAND.getMessage());
            Command commandToExecute = EnumCommand.valueOf(command.toUpperCase()).getCommand();

            rover.executeCommand(commandToExecute);

            rover.writePosition();
        } while (true);
    }
}
