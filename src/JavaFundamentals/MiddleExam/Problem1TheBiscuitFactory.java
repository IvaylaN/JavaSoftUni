package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem1TheBiscuitFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int competingFactoryProduction = Integer.parseInt(scanner.nextLine());

        // Calculate total production for 30 days
        int totalBiscuits = 0;
        for (int day = 1; day <= 30; day++) {
            if (day % 3 == 0) {
                totalBiscuits += Math.floor(biscuitsPerDayPerWorker * workers * 0.75);
            } else {
                totalBiscuits += biscuitsPerDayPerWorker * workers;
            }
        }

        // Print the total production
        System.out.printf("You have produced %d biscuits for the past month.%n", totalBiscuits);

        // Calculate the percentage difference
        double percentageDifference = ((double) totalBiscuits - competingFactoryProduction) / competingFactoryProduction * 100;

        // Print the percentage difference
        if (totalBiscuits > competingFactoryProduction) {
            System.out.printf("You produce %.2f percent more biscuits.%n", percentageDifference);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.%n", Math.abs(percentageDifference));
        }
    }
}

