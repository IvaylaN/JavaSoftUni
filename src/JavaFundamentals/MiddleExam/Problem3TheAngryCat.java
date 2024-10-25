package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem3TheAngryCat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the price ratings
        String[] priceRatingsInput = scanner.nextLine().split(", ");
        int[] priceRatings = new int[priceRatingsInput.length];
        for (int i = 0; i < priceRatingsInput.length; i++) {
            priceRatings[i] = Integer.parseInt(priceRatingsInput[i]);
        }

        // Read the entry point
        int entryPoint = Integer.parseInt(scanner.nextLine());

        // Read the type of items to break
        String itemType = scanner.nextLine();

        // Determine the entry point value
        int entryValue = priceRatings[entryPoint];

        // Calculate the damage to the left and right
        int leftDamage = 0;
        int rightDamage = 0;

        for (int i = 0; i < entryPoint; i++) {
            if ((itemType.equals("cheap") && priceRatings[i] < entryValue) ||
                    (itemType.equals("expensive") && priceRatings[i] >= entryValue)) {
                leftDamage += priceRatings[i];
            }
        }

        for (int i = entryPoint + 1; i < priceRatings.length; i++) {
            if ((itemType.equals("cheap") && priceRatings[i] < entryValue) ||
                    (itemType.equals("expensive") && priceRatings[i] >= entryValue)) {
                rightDamage += priceRatings[i];
            }
        }

        // Determine the result
        if (leftDamage >= rightDamage) {
            System.out.printf("Left - %d%n", leftDamage);
        } else {
            System.out.printf("Right - %d%n", rightDamage);
        }
    }
}

