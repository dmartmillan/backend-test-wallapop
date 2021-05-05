package marsrovertest;

import marsrover.Obstacle;
import marsrover.error.EnumError;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObstacleTest extends BaseTest {

    @Test
    public void createObstacleTest() {
        String posX = "2";
        String posY = "2";
        Obstacle obstacle = new Obstacle(posX, posY);
        assertEquals(Integer.parseInt(posX), obstacle.getPositionX());
        assertEquals(Integer.parseInt(posY), obstacle.getPositionY());
    }

    @Test
    public void createObstacleWithWrongValuesTest() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(EnumError.NOT_NUMBER.getError());

        String posX = "qwert";
        String posY = "2";
        Obstacle obstacle = new Obstacle(posX, posY);
    }
}
