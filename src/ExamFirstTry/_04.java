package ExamFirstTry;

import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double possibleSales = 0;
        double salesMaded = 0;
        double rating = 0;
        double sales = 0;
        double ratingCount = 0;

        for (int i = 1; i <= n; i++) {
            int salesAndRating = Integer.parseInt(scanner.nextLine());
            rating = salesAndRating % 10;
            possibleSales = salesAndRating / 10;
            sales = possibleSales  * 0.5;

        }

            if (rating == 2) {
                salesMaded = 0;
                sales += salesMaded;
                ratingCount += rating;
            } else if (rating == 3) {
                salesMaded = 0.5 * possibleSales;
                sales += salesMaded;
                ratingCount += rating;
            } else if (rating == 4) {
                salesMaded = 0.7 * possibleSales;
                sales += salesMaded;
                ratingCount += rating;
            } else if (rating == 5) {
                salesMaded = 0.85 * possibleSales;
                sales += salesMaded;
                ratingCount += rating;
            } else if (rating == 6) {
                salesMaded = possibleSales;
                sales += salesMaded;
                ratingCount += rating;

            }

            double avgRating = rating  / n;

            System.out.printf("%.2f%n", sales);
            System.out.printf("%.2f", avgRating);

        }
    }
