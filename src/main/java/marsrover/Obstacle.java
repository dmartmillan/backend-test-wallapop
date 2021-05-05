package marsrover;

import marsrover.error.EnumError;

public class Obstacle {
    private int positionX;
    private int positionY;

    public Obstacle(String posX, String posY) {
        try {
            this.positionX = Integer.parseInt(posX);
        } catch (Exception e) {
            throw new IllegalArgumentException(EnumError.NOT_NUMBER.getError());
        }

        try {
            this.positionY = Integer.parseInt(posY);
        } catch (Exception e) {
            throw new IllegalArgumentException(EnumError.NOT_NUMBER.getError());
        }
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }
}
