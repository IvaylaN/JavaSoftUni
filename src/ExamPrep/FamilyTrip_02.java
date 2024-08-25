package ExamPrep;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = Double.parseDouble(scanner.nextLine());
        int percentAdditionalMoney = Integer.parseInt(scanner.nextLine());

        if (days > 7) {
            pricePerDay = pricePerDay - (pricePerDay * 0.05);
        }

        double priceForAllDays = days * pricePerDay;
        double additionalMoney = percentAdditionalMoney * 1.0 / 100 * budget;

        double moneyNeeded = priceForAllDays + additionalMoney;

        double diff = Math.abs(moneyNeeded - budget);
        if (budget >= moneyNeeded) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }
    }

}
