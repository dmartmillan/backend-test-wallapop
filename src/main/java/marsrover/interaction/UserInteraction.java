package marsrover.interaction;
import java.util.Scanner;

public class UserInteraction {

    private static final Scanner reader = new Scanner(System.in);

    public static int readNumber(String message) {
        if (message != null && !message.equals("")) System.out.println(message);
        return reader.nextInt();
    }

    public static String readText(String message) {
        if (message != null && !message.equals("")) System.out.println(message);
        reader.useDelimiter("\n");
        return reader.next();
    }

    public static void writePosition(String position) {
        System.out.println(position);
    }
}
