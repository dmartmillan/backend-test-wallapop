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

    public static int readHorizontalSize() throws Exception {
        System.out.println(Message.HORIZONTAL_SIZE.getMessage());
        return reader.nextInt();
    }

    static public int readVerticalSize() throws Exception {
        System.out.println(Message.VERTICAL_SIZE.getMessage());
        return reader.nextInt();
    }

    public static int readPositionX() throws Exception {
        System.out.println(Message.POSITION_X.getMessage());
        return reader.nextInt();
    }

    public static int readPositionY() throws Exception {
        System.out.println(Message.POSITION_Y.getMessage());
        return reader.nextInt();
    }

    public static String readDirection() throws Exception {
        System.out.println(Message.DIRECTION.getMessage());
        return reader.next(); //n = north, e = east, w = west, s = south
    }
}
