package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem1QuestInTheWoods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int days = Integer.parseInt(scanner.nextLine());
        int participants = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerPersonPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerPersonPerDay = Double.parseDouble(scanner.nextLine());

        // Calculate total water and food required
        double totalWater = days * participants * waterPerPersonPerDay;
        double totalFood = days * participants * foodPerPersonPerDay;

        // Process each day's energy loss
        for (int day = 1; day <= days; day++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            energy -= energyLoss;

            if (energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.%n", totalFood, totalWater);
                return;
            }

            if (day % 2 == 0) {
                energy += energy * 0.05;
                totalWater -= totalWater * 0.30;
            }

            if (day % 3 == 0) {
                energy += energy * 0.10;
                totalFood -= totalFood / participants;
            }
        }

        System.out.printf("You are ready for the quest. You will be left with %.2f energy!%n", energy);
    }
}

