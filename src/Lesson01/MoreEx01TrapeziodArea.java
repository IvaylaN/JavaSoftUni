package Lesson01;
import java.util.Scanner;
public class MoreEx01TrapeziodArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sideb1 = Double.parseDouble(scanner.nextLine());
        double sideb2 = Double.parseDouble(scanner.nextLine());
        double high= Double.parseDouble(scanner.nextLine());

        double area = (sideb1 + sideb2) * high / 2;
        System.out.printf("%.2f %n", area);

    }
}
