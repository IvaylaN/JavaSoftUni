package JavaBasics.Lesson01;

import java.util.Scanner;
public class Task03RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = Integer.parseInt(scanner.nextLine());
        int side2 = Integer.parseInt(scanner.nextLine());
        int area = side1 * side2;
        System.out.println(area);

    }
}
