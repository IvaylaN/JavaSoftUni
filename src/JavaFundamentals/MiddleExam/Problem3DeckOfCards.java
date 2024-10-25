package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3DeckOfCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list of cards
        String[] initialCards = scanner.nextLine().split(", ");
        List<String> cards = new ArrayList<>();
        for (String card : initialCards) {
            cards.add(card);
        }

        // Read the number of commands
        int n = Integer.parseInt(scanner.nextLine());

        // Process each command
        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(", ");
            String command = commandParts[0];

            switch (command) {
                case "Add":
                    String cardToAdd = commandParts[1];
                    if (cards.contains(cardToAdd)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cards.add(cardToAdd);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    String cardToRemove = commandParts[1];
                    if (cards.remove(cardToRemove)) {
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    if (indexToRemove >= 0 && indexToRemove < cards.size()) {
                        cards.remove(indexToRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(commandParts[1]);
                    String cardToInsert = commandParts[2];
                    if (indexToInsert >= 0 && indexToInsert < cards.size()) {
                        if (cards.contains(cardToInsert)) {
                            System.out.println("Card is already added");
                        } else {
                            cards.add(indexToInsert, cardToInsert);
                            System.out.println("Card successfully added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        // Print the final list of cards
        System.out.println(String.join(", ", cards));
    }
}

