package Lesson01;
import java.util.Scanner;
public class Task09YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sqMeters = Double.parseDouble(scanner.nextLine());
        double totalPrice =  sqMeters * 7.61;
        double totalDiscount = totalPrice * 0.18;
        double finalSum = totalPrice - totalDiscount;
        System.out.println("The final price is: " + finalSum + " lv.");
        System.out.println("The discount is: " + totalDiscount + " lv.");
    }
}
