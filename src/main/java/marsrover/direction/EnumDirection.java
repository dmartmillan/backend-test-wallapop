package marsrover.direction;

public enum EnumDirection {
    N(new NorthDirection()),
    S(new SouthDirection()),
    W(new WestDirection()),
    E(new EastDirection());

    private final Direction direction;

    EnumDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
