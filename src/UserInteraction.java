import java.util.Scanner;

public class UserInput {

    private static final Scanner reader = new Scanner(System.in);

    /*static void checkNonNegative(int input) throws Exception {
        if (input <= 0) throw new Exception();
    }*/

    public static int readHorizontalSize() throws Exception {
        System.out.println("Insert horizontal map size:");
        return reader.nextInt();
    }

    static public int readVerticalSize() throws Exception {
        System.out.println("Insert vertical map size:");
        return reader.nextInt();
    }

    public static int readPositionX() throws Exception {
        System.out.println("Insert horizontal initial rover position:");
        return reader.nextInt();
    }

    public static int readPositionY() throws Exception {
        System.out.println("Insert vertical initial rover position:");
        return reader.nextInt();
    }
}
