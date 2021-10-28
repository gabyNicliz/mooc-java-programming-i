
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] strArray = input.split(" ");
            
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].contains("av")) {
                    System.out.println(strArray[i]);
                }
            }
        }
    }
}
