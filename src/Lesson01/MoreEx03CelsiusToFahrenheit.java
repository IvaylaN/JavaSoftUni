package Lesson01;
import java.util.Scanner;
public class MoreEx03CelsiusToFahrenheit {
    public static void main(String[] args) {

        //F=C*1.8+32

        Scanner scanner = new Scanner((System.in));
        double F = Double.parseDouble(scanner.nextLine());


        double C = (F * 1.80) + 32;
        System.out.printf("%.2f %n", C);
    }
}
