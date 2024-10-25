package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem1CookingMasterclass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());

        // Calculate the number of aprons needed (20% more, rounded up)
        int apronsNeeded = (int) Math.ceil(students * 1.2);

        // Calculate the number of flour packages needed (every fifth package is free)
        int flourPackagesNeeded = students - (students / 5);

        // Calculate the total cost
        double totalCost = (flourPackagesNeeded * priceFlour) + (students * 10 * priceEgg) + (apronsNeeded * priceApron);

        // Print the result
        if (totalCost <= budget) {
            System.out.printf("Items purchased for %.2f$.\n", totalCost);
        } else {
            System.out.printf("%.2f$ more needed.\n", totalCost - budget);
        }
    }
}

