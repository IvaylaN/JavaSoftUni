package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial sequence of numbers
        String[] initialNumbers = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String num : initialNumbers) {
            numbers.add(Integer.parseInt(num));
        }

        // Process commands
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];

            switch (action) {
                case "Add":
                    int valueToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(valueToAdd);
                    break;
                case "Remove":
                    int valueToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(valueToRemove));
                    break;
                case "Replace":
                    int valueToReplace = Integer.parseInt(commandParts[1]);
                    int replacement = Integer.parseInt(commandParts[2]);
                    int indexToReplace = numbers.indexOf(valueToReplace);
                    if (indexToReplace != -1) {
                        numbers.set(indexToReplace, replacement);
                    }
                    break;
                case "Collapse":
                    int collapseValue = Integer.parseInt(commandParts[1]);
                    numbers.removeIf(num -> num < collapseValue);
                    break;
            }

            command = scanner.nextLine();
        }

        // Print the final sequence
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
