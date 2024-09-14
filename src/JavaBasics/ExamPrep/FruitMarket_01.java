package JavaBasics.ExamPrep;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());


        double raspberriesPrice = strawberriesPrice / 2;
        double orangePrice = raspberriesPrice - (raspberriesPrice * 0.40);
        double bananasPrice = raspberriesPrice - (raspberriesPrice * 0.80);

        double raspberriesSum = raspberriesPrice * raspberriesKg;
        double orangeSum = orangePrice * orangeKg;
        double bananasSum = bananasPrice * bananasKg;
        double strawberriesSum = strawberriesPrice * strawberriesKg;

        double totalSum = raspberriesSum + orangeSum + bananasSum + strawberriesSum;

        System.out.printf("%.2f", totalSum);
    }
}
