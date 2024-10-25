package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem2SpaceTravel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the travel route, fuel, and ammunition
        String[] route = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (String command : route) {
            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];

            switch (action) {
                case "Travel":
                    int distance = Integer.parseInt(commandParts[1]);
                    if (fuel >= distance) {
                        fuel -= distance;
                        System.out.printf("The spaceship travelled %d light-years.%n", distance);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Enemy":
                    int enemyArmour = Integer.parseInt(commandParts[1]);
                    if (ammunition >= enemyArmour) {
                        ammunition -= enemyArmour;
                        System.out.printf("An enemy with %d armour is defeated.%n", enemyArmour);
                    } else if (fuel >= enemyArmour * 2) {
                        fuel -= enemyArmour * 2;
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyArmour);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Repair":
                    int repairAmount = Integer.parseInt(commandParts[1]);
                    fuel += repairAmount;
                    ammunition += repairAmount * 2;
                    System.out.printf("Ammunitions added: %d.%n", repairAmount * 2);
                    System.out.printf("Fuel added: %d.%n", repairAmount);
                    break;
                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    return;
            }
        }
    }
}

