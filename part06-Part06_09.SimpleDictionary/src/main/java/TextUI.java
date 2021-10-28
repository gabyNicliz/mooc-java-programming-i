/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (command.equals("add")) {
                this.addTranslation();
            } else if (command.equals("search")) {
                this.searchWord();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    private void addTranslation() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    private void searchWord() {
        System.out.print("To be translated: ");
        String searchWord = scanner.nextLine();
        String translation = dictionary.translate(searchWord);

        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word " + searchWord + " was not found");
        }
    }
}
