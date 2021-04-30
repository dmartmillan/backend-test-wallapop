public class MarsRover {

    public static void main(String[] args) throws Exception {

        int sizeH = UserInteraction.readNumber(Message.HORIZONTAL_SIZE.getMessage());
        int sizeV = UserInteraction.readNumber(Message.VERTICAL_SIZE.getMessage());

        Mars mars = new Mars(sizeH, sizeV);

        int roverX = UserInteraction.readNumber(Message.POSITION_X.getMessage());
        int roverY = UserInteraction.readNumber(Message.POSITION_Y.getMessage());
        String roverDirection = UserInteraction.readText(Message.DIRECTION.getMessage());

        Rover rover = new Rover(roverX, roverY, roverDirection);

        do {
            String command = UserInteraction.readText(Message.COMMAND.getMessage());
            if (command.equals("f")) {
                if (roverDirection.equals("n")) {
                    roverY += 1;
                }
                if (roverDirection.equals("w")) {
                    roverX -= 1;
                }
                if (roverDirection.equals("s")) {
                    roverY -= 1;
                }
                if (roverDirection.equals("e")) {
                    roverX += 1;
                }
            }
            if (command.equals("b")) {
                if (roverDirection.equals("n")) {
                    roverY -= 1;
                }
                if (roverDirection.equals("w")) {
                    roverX += 1;
                }
                if (roverDirection.equals("s")) {
                    roverY += 1;
                }
                if (roverDirection.equals("e")) {
                    roverX -= 1;
                }
            }
            if (command.equals("l")) {
                if (roverDirection.equals("n")) {
                    roverDirection = "w";
                }
                if (roverDirection.equals("w")) {
                    roverDirection = "s";
                }
                if (roverDirection.equals("s")) {
                    roverDirection = "e";
                }
                if (roverDirection.equals("e")) {
                    roverDirection = "n";
                }
            }
            if (command.equals("r")) {
                if (roverDirection.equals("n")) {
                    roverDirection = "e";
                }
                if (roverDirection.equals("e")) {
                    roverDirection = "s";
                }
                if (roverDirection.equals("s")) {
                    roverDirection = "w";
                }
                if (roverDirection.equals("w")) {
                    roverDirection = "n";
                }
            }
            System.out.printf("Rover is at x:%d y:%d facing:%s%n", roverX, roverY, roverDirection);
        } while (true);
    }
}
