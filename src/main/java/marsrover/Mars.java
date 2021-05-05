package marsrover;

import marsrover.error.EnumError;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mars {
    private final int sizeHorizontal;
    private final int sizeVertical;
    private final ArrayList<Obstacle> obstacles = new ArrayList<>();

    public Mars(int sizeH, int sizeV, String listObstacles) {
        if (sizeH <= 0 || sizeV <= 0) {
            throw new IllegalArgumentException(EnumError.MAP_SIZE.getError());
        }
        this.sizeHorizontal = sizeH;
        this.sizeVertical = sizeV;

        if (!listObstacles.equals("")) {
            this.createObstaclesList(listObstacles);
        }
    }

    public int getSizeHorizontal() {
        return this.sizeHorizontal;
    }

    public int getSizeVertical() {
        return this.sizeVertical;
    }

    public ArrayList<Obstacle> getObstacles() {
        return this.obstacles;
    }

    private void createObstaclesList(String listObstacles) {
        String[] obstacles = listObstacles.split(" ");
        Pattern pattern = Pattern.compile("-?\\d+");
        for (String obstacle : obstacles) {
            Matcher matcher = pattern.matcher(obstacle);
            List<String> allMatches = new ArrayList<String>();
            while (matcher.find()) {
                allMatches.add(matcher.group());
            }
            if (allMatches.size() != 2) {
                throw new IllegalArgumentException(EnumError.BAD_FORMAT.getError());
            }
            Obstacle obs = new Obstacle(allMatches.get(0), allMatches.get(1));

            this.validateObstacle(obs);

            this.obstacles.add(obs);
        }
    }

    private void validateObstacle(Obstacle obstacle) {
        if (obstacle.getPositionX() > this.sizeHorizontal || obstacle.getPositionY() > this.sizeVertical
        || obstacle.getPositionX() < 0 || obstacle.getPositionY() < 0) {
            throw new IllegalArgumentException(EnumError.POSITION.getError());
        }
    }
}
