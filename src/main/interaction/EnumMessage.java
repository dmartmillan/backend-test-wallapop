package main.interaction;

public enum EnumMessage {
    HORIZONTAL_SIZE("Insert horizontal map size:"),
    VERTICAL_SIZE("Insert vertical map size:"),
    POSITION_X("Insert horizontal initial rover position:"),
    POSITION_Y("Insert vertical initial rover position:"),
    DIRECTION("Insert initial rover direction:"),
    COMMAND("Insert command (f = forward, b = backward, l = turn left, r = turn right):");

    private final String message;

    EnumMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
