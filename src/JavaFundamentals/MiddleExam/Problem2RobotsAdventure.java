package JavaFundamentals.MiddleExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2RobotsAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial grid items
        List<Integer> grid = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int totalItemsCollected = 0;

        // Process commands
        String command = scanner.nextLine();
        while (!command.equals("Adventure over")) {
            String[] commandParts = command.split("\\$");
            String action = commandParts[0];

            switch (action) {
                case "Step Backward":
                    int startIndexBackward = Integer.parseInt(commandParts[1]);
                    int stepsBackward = Integer.parseInt(commandParts[2]);
                    if (startIndexBackward >= 0 && startIndexBackward < grid.size()) {
                        int newIndex = (startIndexBackward - stepsBackward) % grid.size();
                        if (newIndex < 0) {
                            newIndex += grid.size();
                        }
                        totalItemsCollected += grid.get(newIndex);
                        grid.set(newIndex, 0);
                    }
                    break;
                case "Step Forward":
                    int startIndexForward = Integer.parseInt(commandParts[1]);
                    int stepsForward = Integer.parseInt(commandParts[2]);
                    if (startIndexForward >= 0 && startIndexForward < grid.size()) {
                        int newIndex = (startIndexForward + stepsForward) % grid.size();
                        totalItemsCollected += grid.get(newIndex);
                        grid.set(newIndex, 0);
                    }
                    break;
                case "Double":
                    int indexToDouble = Integer.parseInt(commandParts[1]);
                    if (indexToDouble >= 0 && indexToDouble < grid.size()) {
                        grid.set(indexToDouble, grid.get(indexToDouble) * 2);
                    }
                    break;
                case "Switch":
                    Collections.reverse(grid);
                    break;
            }

            command = scanner.nextLine();
        }

        // Print the final state of the grid and total items collected
        System.out.println(grid.stream().map(String::valueOf).collect(Collectors.joining(" - ")));
        System.out.println("Robo finished the adventure with " + totalItemsCollected + " items!");
    }
}

