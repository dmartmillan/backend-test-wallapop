package marsrovertest;

import marsrover.Mars;
import marsrover.Obstacle;
import marsrover.error.EnumError;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MarsTest extends BaseTest {

    @Test
    public void normalMarsTest() throws Exception {
        int sizeH = 20;
        int sizeV = 10;
        Mars mars = new Mars(sizeH, sizeV, obstacles);
        assertEquals(sizeH, mars.getSizeHorizontal());
        assertEquals(sizeV, mars.getSizeVertical());
    }

    @Test
    public void valuesOfZeroMarsTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.MAP_SIZE.getError());

        int sizeH = 0;
        int sizeV = 0;
        Mars mars = new Mars(sizeH, sizeV, obstacles);
    }

    @Test
    public void negativeValuesMarsTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.MAP_SIZE.getError());

        int sizeH = -10;
        int sizeV = 4;
        Mars mars = new Mars(sizeH, sizeV, obstacles);
    }

    @Test
    public void createMarsWithObstaclesTest() {
        String newObstacles = "1,1 5,10";
        Mars mars = new Mars(sizeH, sizeV, newObstacles);
        ArrayList<Obstacle> resultObstacle = new ArrayList<Obstacle>();
        resultObstacle.add(new Obstacle("1","1"));
        resultObstacle.add(new Obstacle("5","10"));
        assertEquals(resultObstacle.size(), mars.getObstacles().size());
        assertEquals(resultObstacle.get(0).getPositionX(), mars.getObstacles().get(0).getPositionX());
        assertEquals(resultObstacle.get(0).getPositionY(), mars.getObstacles().get(0).getPositionY());
        assertEquals(resultObstacle.get(1).getPositionX(), mars.getObstacles().get(1).getPositionX());
        assertEquals(resultObstacle.get(1).getPositionY(), mars.getObstacles().get(1).getPositionY());
    }

    @Test
    public void createMarsWithObstaclesWithWrongValuesTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.BAD_FORMAT.getError());

        String newObstacles = "-1,1 20,0";
        Mars mars = new Mars(sizeH, sizeV, newObstacles);
    }
}
