package Lesson01;
import java.util.Scanner;
public class MoreEx02TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( (System.in));
        double side = Double.parseDouble(scanner.nextLine());
        double high = Double.parseDouble(scanner.nextLine());

        double area = side * high / 2 ;
        System.out.printf("%.2f %n", area);
    }
}
