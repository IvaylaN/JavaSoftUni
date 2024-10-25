package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem2CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list of coffees
        List<String> coffees = new ArrayList<>();
        String[] initialCoffees = scanner.nextLine().split("\\s+");
        Collections.addAll(coffees, initialCoffees);

        // Read the number of commands
        int n = Integer.parseInt(scanner.nextLine());

        // Process each command
        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");
            String command = commandParts[0];

            switch (command) {
                case "Include":
                    String coffeeToInclude = commandParts[1];
                    coffees.add(coffeeToInclude);
                    break;
                case "Remove":
                    String position = commandParts[1];
                    int numberOfCoffees = Integer.parseInt(commandParts[2]);
                    if (numberOfCoffees <= coffees.size()) {
                        if (position.equals("first")) {
                            for (int j = 0; j < numberOfCoffees; j++) {
                                coffees.remove(0);
                            }
                        } else if (position.equals("last")) {
                            for (int j = 0; j < numberOfCoffees; j++) {
                                coffees.remove(coffees.size() - 1);
                            }
                        }
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    if (index1 >= 0 && index1 < coffees.size() && index2 >= 0 && index2 < coffees.size()) {
                        Collections.swap(coffees, index1, index2);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                    break;
            }
        }

        // Print the final list of coffees
        System.out.println("Coffees:");
        for (String coffee : coffees) {
            System.out.print(coffee + " ");
        }
    }
}

