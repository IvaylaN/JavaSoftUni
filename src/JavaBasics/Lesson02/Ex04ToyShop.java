package JavaBasics.Lesson02;


import java.util.Scanner;

public class Ex04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());

        int puzelsPcs = Integer.parseInt(scanner.nextLine());
        int dollsPcs = Integer.parseInt(scanner.nextLine());
        int bearsPcs = Integer.parseInt(scanner.nextLine());
        int minionsPcs = Integer.parseInt(scanner.nextLine());
        int camionsPcs = Integer.parseInt(scanner.nextLine());

        int totalPcs = puzelsPcs + dollsPcs + bearsPcs + minionsPcs + camionsPcs;
        double totalPrice = puzelsPcs * 2.60 + dollsPcs * 3 + bearsPcs * 4.10 + minionsPcs * 8.20 + camionsPcs * 2;

        if (totalPcs >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        double rent = totalPrice - (totalPrice * 0.90);
        double finalPrice = totalPrice - rent;

        double diff = Math.abs(finalPrice - excursionPrice);

        if (finalPrice >= excursionPrice){
            System.out.printf("Yes! %.2f lv left.", diff);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }
}
