package Lesson01;
import java.util.Scanner;
public class Ex08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualTax = Integer.parseInt(scanner.nextLine());

        double shoesPrice = annualTax * 0.6;
        double dressPrice = shoesPrice * 0.8;
        double ballPrice = dressPrice/4;
        double accessPrice = ballPrice/5;

        double totalPrice = shoesPrice + dressPrice + ballPrice + accessPrice +annualTax;

        System.out.println(totalPrice);
    }
}
