
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printend?");
        String fileName = scanner.nextLine();
        
        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {
                String row = readFile.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
