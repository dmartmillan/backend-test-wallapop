package marsrover.error;

public enum EnumError {
    MAP_SIZE("Wrong map size")
    ;

    private final String error;

    EnumError(String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }
}
