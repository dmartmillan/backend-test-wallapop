package main.command;

public class Rover {

    private Mars planet;
    private int roverX;
    private int roverY;
    private String roverDirection;

    public Rover(Mars planet,int roverX, int roverY, String roverDirection) {
        this.planet = planet;
        this.roverX = roverX;
        this.roverY = roverY;
        this.roverDirection = roverDirection;
    }
}
