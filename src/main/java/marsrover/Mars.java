package marsrover;

import marsrover.error.EnumError;

public class Mars {
    private int sizeHorizontal;
    private int sizeVertical;

    public Mars(int sizeH, int sizeV) {
        if (sizeH <= 0 || sizeV <= 0) {
            throw new IllegalArgumentException(EnumError.MAP_SIZE.getError());
        }
        this.sizeHorizontal = sizeH;
        this.sizeVertical = sizeV;
    }

    public int getSizeHorizontal() {
        return this.sizeHorizontal;
    }

    public int getSizeVertical() {
        return this.sizeVertical;
    }
}
