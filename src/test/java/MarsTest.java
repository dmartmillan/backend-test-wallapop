import marsrover.Mars;
import marsrover.error.EnumError;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsTest extends BaseTest {

    @Test
    public void normalMarsTest() throws Exception {
        int sizeH = 20;
        int sizeV = 10;
        Mars mars = new Mars(sizeH, sizeV);
        assertEquals(sizeH, mars.getSizeHorizontal());
        assertEquals(sizeV, mars.getSizeVertical());
    }

    @Test
    public void valuesOfZeroMarsTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.MAP_SIZE.getError());

        int sizeH = 0;
        int sizeV = 0;
        Mars mars = new Mars(sizeH, sizeV);
    }

    @Test
    public void negativeValuesMarsTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.MAP_SIZE.getError());

        int sizeH = -10;
        int sizeV = 4;
        Mars mars = new Mars(sizeH, sizeV);
    }
}
