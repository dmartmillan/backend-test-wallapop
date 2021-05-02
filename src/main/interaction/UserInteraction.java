package main.interaction;
import java.util.Scanner;

public class UserInteraction {

    private static final Scanner reader = new Scanner(System.in);

    /*static void checkNonNegative(int input) throws Exception {
        if (input <= 0) throw new Exception();
    }*/

    public static int readNumber(String message) {
        if (message != null && !message.equals("")) System.out.println(message);
        return reader.nextInt();
    }

    public static String readText(String message) {
        if (message != null && !message.equals("")) System.out.println(message);
        return reader.next(); //n = north, e = east, w = west, s = south
    }

    public static void writePosition(int coordinateX, int coordinateY, char direction) {
        System.out.printf("Rover is at x:%d y:%d facing:%s%n", coordinateX, coordinateY, direction);
    }
}
