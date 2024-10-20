package JavaBasics.ExamPreparation;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine(); //"Summer" и "Winter"
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (season.equals("Summer")) {
            if (destination.equals("Dubai")) {
                price = 40000;
            } else if (destination.equals("Sofia")) {
                price = 12500;
            } else if (destination.equals("London")) {
                price = 20250;
            }
        } else if (season.equals("Winter")) {
            if (destination.equals("Dubai")) {
                price = 45000;
            } else if (destination.equals("Sofia")) {
                price = 17000;
            } else if (destination.equals("London")) {
                price = 24000;
            }
        }

        double sum = days * price;

        if (destination.equals("Dubai")) {
            sum = sum - (sum * 0.30); // sum * 0.70;
        } else if (destination.equals("Sofia")) {
            sum = sum + (sum * 0.25);
        }

        double diff = Math.round(Math.abs(sum - budget));
        if (sum <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }
    }
}
