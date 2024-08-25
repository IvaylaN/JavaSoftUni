package Lesson02;
import java.util.Scanner;
public class Task01ExcellentResult {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scale = Integer.parseInt(scanner.nextLine());

        if (scale >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Poor Grade!");
            System.out.println("Repeat class!");
        }
    }
}
