package JavaBasics.Exam;

import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int bottlesBeerCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());

        double totalBeerPrice = bottlesBeerCount * 1.20;
        double oneChipsPrice = totalBeerPrice * 0.45;
        double totalChipsPrice = Math.ceil(chipsCount * oneChipsPrice);
        double totalSum = totalBeerPrice + totalChipsPrice;

        double diff = Math.abs(budget - totalSum);

        if (budget >= totalSum){
            System.out.printf("%s bought a snack and has %.2f leva left.", playerName, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", playerName, diff);

        }

    }
}