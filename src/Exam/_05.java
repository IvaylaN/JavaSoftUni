package Exam;

import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int childrenCount = 0;
        int adultsCount = 0;
        int toyPrice = 5;
        int sweaterPrice = 15;

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Christmas")) {
                break;
            }

            int age = Integer.parseInt(input);
            if (age <= 16) {
                childrenCount++;
            } else {
                adultsCount++;
            }
        }

        int moneyForToys = childrenCount * toyPrice;
        int moneyForSweaters = adultsCount * sweaterPrice;

        System.out.println("Number of adults: " + adultsCount);
        System.out.println("Number of kids: " + childrenCount);
        System.out.println("Money for toys: " + moneyForToys);
        System.out.println("Money for sweaters: " + moneyForSweaters);
    }
}
