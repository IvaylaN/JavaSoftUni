package Lesson01;
import java.util.Scanner;
public class Ex03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int monthTerm = Integer.parseInt(scanner.nextLine());
        double yearInterest = Double.parseDouble(scanner.nextLine());

        double sum = depositSum + monthTerm * ((depositSum * yearInterest/100) / 12);
        System.out.println(sum);
    }
}
