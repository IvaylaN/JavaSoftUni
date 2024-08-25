package Lesson05;

import java.util.Scanner;

public class Task05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        double totalSum = 0;
        while(!text.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(text);
            if (sum < 0) {
                System.out. println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", sum);
            totalSum = totalSum + sum;
            text = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
