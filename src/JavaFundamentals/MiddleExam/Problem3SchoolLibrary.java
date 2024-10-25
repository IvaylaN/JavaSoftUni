package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3SchoolLibrary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list of books
        String[] initialBooks = scanner.nextLine().split("&");
        List<String> bookShelf = new ArrayList<>();
        Collections.addAll(bookShelf, initialBooks);

        // Process commands
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] commandParts = command.split(" \\| ");
            String action = commandParts[0];

            switch (action) {
                case "Add Book":
                    String bookToAdd = commandParts[1];
                    if (!bookShelf.contains(bookToAdd)) {
                        bookShelf.add(0, bookToAdd);
                    }
                    break;
                case "Take Book":
                    String bookToTake = commandParts[1];
                    bookShelf.remove(bookToTake);
                    break;
                case "Swap Books":
                    String book1 = commandParts[1];
                    String book2 = commandParts[2];
                    if (bookShelf.contains(book1) && bookShelf.contains(book2)) {
                        int index1 = bookShelf.indexOf(book1);
                        int index2 = bookShelf.indexOf(book2);
                        Collections.swap(bookShelf, index1, index2);
                    }
                    break;
                case "Insert Book":
                    String bookToInsert = commandParts[1];
                    if (!bookShelf.contains(bookToInsert)) {
                        bookShelf.add(bookToInsert);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index >= 0 && index < bookShelf.size()) {
                        System.out.println(bookShelf.get(index));
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        // Print the final state of the book shelf
        System.out.println(String.join(", ", bookShelf));
    }
}

