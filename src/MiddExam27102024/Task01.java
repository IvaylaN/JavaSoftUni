package MiddExam27102024;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double journeyCost = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());

        double savedMoney = 0.0;
        for (int month = 1; month <= months; month++) {
            if (month % 2 == 1 && month != 1) {
                savedMoney = savedMoney - (savedMoney * 0.16);
            }
            if (month % 4 == 0) {
                double bossMoney = savedMoney * 0.25;
                savedMoney = savedMoney + bossMoney;
            }
            savedMoney += journeyCost * 0.25;
        }
        if (savedMoney >= journeyCost) {
            double moneyForSouvenirs = savedMoney - journeyCost;
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.%n", moneyForSouvenirs);
        } else {
            double moneyNeeded = journeyCost - savedMoney;
            System.out.printf("Sorry. You need %.2flv. more.%n", moneyNeeded);
        }
    }
}


