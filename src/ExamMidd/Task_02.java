package ExamMidd;

import java.util.Scanner;
public class Task_02 {
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
                }
                else if (i % 3 == 0) {
                    expensesPerDay = expensesPerDay * 1.50;
                }
                double profitPerCity = incomePerDay - expensesPerDay;

                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profitPerCity);

                totalProfit += profitPerCity;
            }
            System.out.printf("Burger Bus total profit: %.2f leva.%n", totalProfit);
        }
    }


