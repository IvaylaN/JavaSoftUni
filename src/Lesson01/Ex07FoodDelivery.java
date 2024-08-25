package Lesson01;
import java.util.Scanner;
public class Ex07FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());

        double delivery = 2.5;

        double priceChickenMenu = chickenMenus * 10.35;
        double priceFishMenu = fishMenus * 12.40;
        double priceVeganMenu = veganMenus * 8.15;

        double totalPriceMenus = priceFishMenu + priceChickenMenu + priceVeganMenu;
        double desert = totalPriceMenus * 0.2;

        System.out.println(totalPriceMenus + desert + delivery);


    }
}
