package Exam;

import java.util.Scanner;
public class _06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLocations = Integer.parseInt(scanner.nextLine());

        double avgIncome = 0;
        double income = 0;
        int days = 0;
        double expectedAvgIncome = 0;


        for (int i = 0; i < countLocations; i++) {
            expectedAvgIncome = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < days; j++) {
                int currentIncome = Integer.parseInt(scanner.nextLine());
                income += currentIncome;

            }
        }
        avgIncome = income / days ;
        double diff = Math.abs(avgIncome - expectedAvgIncome);

        if (avgIncome < expectedAvgIncome) {
            System.out.printf("You need %.2f gold.%n", diff);
        } else {
            System.out.printf("Good job! Average gold per day: %.2f%n", avgIncome);
            System.out.printf("You need %.2f gold.%n", diff);
        }
    }
}

