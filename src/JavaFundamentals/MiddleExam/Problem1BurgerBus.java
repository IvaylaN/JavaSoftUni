package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem1BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;

        for (int i = 1; i <= numberOfCities; i++) {
            String cityName = scanner.nextLine();
            double incomePerDay = Double.parseDouble(scanner.nextLine());
            double expensesPerDay = Double.parseDouble(scanner.nextLine());

            if (i % 5 == 0) {
                incomePerDay = incomePerDay * 0.90;
            } else if (i % 3 == 0) {
                expensesPerDay = expensesPerDay * 1.50;
            }
            double profitPerCity = incomePerDay - expensesPerDay;

            System.out.println("Day " + i + ": " + String.format("%.2f", profitPerCity) + " leva.");

            totalProfit += profitPerCity;
        }
        System.out.println("Burger Bus total income: " + String.format("%.2f", totalProfit) + " leva.");

    }
}


