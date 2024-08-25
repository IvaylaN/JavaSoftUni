package Lesson02;
import java.util.Scanner;
public class Task07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        double area = 0;

        if (type.equals("square")) {
            Double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (type.equals("rectangle")) {
            Double a = Double.parseDouble(scanner.nextLine());
            Double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (type.equals("circle")) {
            Double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if (type.equals("triangle")) {
            Double a = Double.parseDouble(scanner.nextLine());
            Double h = Double.parseDouble(scanner.nextLine());
            area = a * h/2;
        }
        System.out.printf("%.3f %n", area);
    }
}
