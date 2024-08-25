package ExamFirstTry;

import java.util.Scanner;

public class ComputerFirm_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        double possibleSales = 0;
        double sales = 0;
        double rating = 0;


        for (int i = 1; i <= n; i++) {

            int salesAndRating = Integer.parseInt(scanner.nextLine());
            rating = salesAndRating % 10;
            possibleSales = salesAndRating / 10;
            sales = possibleSales * 0.5;
        }

        if (rating == 2) {
            sales += possibleSales * 0;
        } else if (rating == 3) {
            sales += possibleSales * 0.5;
        } else if (rating == 4) {
            sales += possibleSales * 0.7;
        } else if (rating == 5) {
            sales += possibleSales * 0.85;
        } else if (rating == 6){
            sales += possibleSales * 1;
        }

        double avgRating = rating / n;

        System.out.printf("%.2f%n", sales);
        System.out.printf("%.2f", avgRating);

    }
}
