package main.direction;

public enum EnumDirection {
    N(new North()),
    S(new South()),
    W(new West()),
    E(new East());

    private final Direction direction;

    EnumDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
