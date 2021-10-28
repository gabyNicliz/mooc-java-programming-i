import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(title, pages, publicationYear));
        }
        
        System.out.print("What information will be printed? ");
        String filterPrinter = scanner.nextLine();
        
        if (filterPrinter.equals("everything")) {
            for (Book book : bookList) {
                System.out.println(book);
            }
        } else if (filterPrinter.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }
        }
    }
}
