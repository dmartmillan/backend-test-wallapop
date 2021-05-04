import marsrover.Mars;
import marsrover.error.EnumError;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class MarsTest extends BaseTest {

    @Test
    @DisplayName("Create a normal map")
    public void normalMarsTest() throws Exception {
        int sizeH = 20;
        int sizeV = 10;
        Mars mars = new Mars(sizeH, sizeV);
        assertEquals(sizeH, mars.getSizeHorizontal());
        assertEquals(sizeV, mars.getSizeVertical());
    }

    @Test
    @DisplayName("Create an impossible map, values of 0")
    public void impossibleMarsTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.MAP_SIZE.getError());

        int sizeH = 0;
        int sizeV = 0;
        Mars mars = new Mars(sizeH, sizeV);
    }

    @Test(expected = Exception.class)
    @DisplayName("Create a second impossible map with negative values")
    public void secondImpossibleMarsTest() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.MAP_SIZE.getError());

        int sizeH = -10;
        int sizeV = 4;
        Mars mars = new Mars(sizeH, sizeV);
    }
}
