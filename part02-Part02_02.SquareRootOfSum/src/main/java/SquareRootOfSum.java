
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        double sqrt = Math.sqrt(num1 + num2);

        if (num1 + num2 < 0) {
            System.out.println("The sum of the two numbers can't be negative,"
                    + " otherwise you can't calculate "
                    + "the square root of the sum");
        } else {
            System.out.println(sqrt);
        }
    }
}
