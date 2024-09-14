package JavaBasics.Lesson02;

import java.util.Scanner;

public class Ex05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int peopleOnScene = Integer.parseInt(scanner.nextLine());
        double dressPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double allDressPrice = peopleOnScene * dressPrice;

        if (peopleOnScene > 150){
            allDressPrice = allDressPrice * 0.90;
        }

        double neededMoney = allDressPrice + decorPrice;

        double diff = Math.abs(neededMoney - budget);
        if (neededMoney > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.%n", diff);
        }

    }
}
