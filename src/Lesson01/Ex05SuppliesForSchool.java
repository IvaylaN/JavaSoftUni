package Lesson01;
import java.util.Scanner;
public class Ex05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPencil = Integer.parseInt(scanner.nextLine());
        int countMarker = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double totalPrice = (countPencil * 5.80) + (countMarker * 7.20) + (liters * 1.20);
        double totalPriceWithDiscount = totalPrice - ( totalPrice * 25/100);
        System.out.println(totalPriceWithDiscount);
    }
}
