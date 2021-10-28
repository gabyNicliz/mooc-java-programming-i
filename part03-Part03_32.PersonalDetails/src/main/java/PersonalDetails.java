
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sumOfYears = 0;
        int counter = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] strArray = input.split(",");
            
            if (longestName.length() < strArray[0].length()) {
                longestName = strArray[0];
            }
            
            sumOfYears += Integer.valueOf(strArray[1]);
            counter++;
        }
        
        System.out.println("Longest name: " + longestName);
        
        double avgBirthYears = sumOfYears / (double) counter;
        System.out.println("Average of the birth years: " + avgBirthYears);
    }
}
