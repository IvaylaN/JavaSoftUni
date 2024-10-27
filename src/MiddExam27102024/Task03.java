
package MiddExam27102024;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> originalDeck = Arrays.asList(scanner.nextLine().split(":"));
        List<String> newDeck = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("Ready")) {
            String[] commandParts = command.split(" ");
            String action = commandParts[0];

            switch (action) {
                case "Add":
                    String addCard = commandParts[1];
                    if (originalDeck.contains(addCard)) {
                        newDeck.add(addCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;

                case "Insert":
                    String insertCard = commandParts[1];
                    int insertIndex = Integer.parseInt(commandParts[2]);
                    if (originalDeck.contains(insertCard) && insertIndex >= 0 && insertIndex <= newDeck.size()) {
                        newDeck.add(insertIndex, insertCard);
                    } else {
                        System.out.println("Error!");
                    }
                    break;

                case "Remove":
                    String removeCard = commandParts[1];
                    if (newDeck.contains(removeCard)) {
                        newDeck.remove(removeCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;

                case "Swap":
                    String card1 = commandParts[1];
                    String card2 = commandParts[2];
                    int index1 = newDeck.indexOf(card1);
                    int index2 = newDeck.indexOf(card2);

                    Collections.swap(newDeck, index1, index2);
                    break;

                case "Shuffle":
                    Collections.reverse(newDeck);
                    break;
                default:
                    System.out.println("Invalid command");
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ",newDeck));
    }

}
