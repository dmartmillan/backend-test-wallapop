package main.command;

public enum EnumCommand {
    F(new MoveForwardCommand()),
    B(new MoveBackwardCommand()),
    L(new TurnLeftCommand()),
    R(new TurnRightCommand());

    private final Command command;

    EnumCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
