
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCounter = 0;
        int positiveSum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                positiveCounter++;
                positiveSum += num;
            }
        }
        
        if (positiveSum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double positiveAverage = positiveSum / (double) positiveCounter;
            System.out.println(positiveAverage);
        }
        
    }
}
