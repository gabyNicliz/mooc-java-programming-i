
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equals("")) {
            return;
        }
        String[] strArray = input.split(",");

        int maxAge = Integer.valueOf(strArray[1]);
        String oldestName = strArray[0];

        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            strArray = input.split(",");

            if (maxAge < Integer.valueOf(strArray[1])) {
                maxAge = Integer.valueOf(strArray[1]);
                oldestName = strArray[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
