
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] strArray = input.split(",");
        int maxAge = Integer.valueOf(strArray[1]);
        
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            strArray = input.split(",");
            
            if (maxAge < Integer.valueOf(strArray[1])) {
                maxAge = Integer.valueOf(strArray[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + maxAge);
    }
}
