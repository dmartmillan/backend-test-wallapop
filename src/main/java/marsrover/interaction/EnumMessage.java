package marsrover.interaction;

public enum EnumMessage {
    HORIZONTAL_SIZE("Insert horizontal map size:"),
    VERTICAL_SIZE("Insert vertical map size:"),
    POSITION_X("Insert horizontal initial rover position:"),
    POSITION_Y("Insert vertical initial rover position:"),
    DIRECTION("Insert initial rover direction (n = north, e = east, w = west, s = south):"),
    COMMAND("Insert command (f = forward, b = backward, l = turn left, r = turn right):"),
    OBSTACLES("Insert a list of obstacles position (e.g. 1,1 3,4 5,5)");

    private final String message;

    EnumMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
