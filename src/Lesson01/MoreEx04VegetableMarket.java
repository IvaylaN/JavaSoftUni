package Lesson01;
import java.util.Scanner;
public class MoreEx04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( (System.in));
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double totalVegetables = (priceVegetables * kgVegetables) / 1.94;
        double totalFruits = (priceFruits * kgFruits) / 1.94;

        double totalSum = totalVegetables + totalFruits;
        System.out.printf("%.2f %n", totalSum);
    }
}
