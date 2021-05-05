package marsrover.error;

public enum EnumError {
    MAP_SIZE("Wrong map size."),
    POSITION("Wrong position."),
    NOT_NUMBER("Argument was not a number."),
    BAD_FORMAT("Argument with a bad format.");

    private final String error;

    EnumError(String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }
}
