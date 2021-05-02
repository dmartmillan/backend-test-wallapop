package main.command;

public enum EnumCommand {
    F(new MoveForward),
    B(new MoveBackward),
    L(new TurnLeft),
    R(new TurnRight);
}
