package main.command;

public enum EnumCommand {
    F(new MoveForward()),
    B(new MoveBackward()),
    L(new TurnLeft()),
    R(new TurnRight());

    private final Command command;

    EnumCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
