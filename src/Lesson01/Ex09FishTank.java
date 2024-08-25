package Lesson01;
import java.util.Scanner;
public class Ex09FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double fishTank = (length * width * height) * 0.001;

        double needLiters = fishTank * (1 - percent/100);
        //double needLiters = fishTank - (fishTank * percent / 100);

        System.out.println(needLiters);
    }
}
