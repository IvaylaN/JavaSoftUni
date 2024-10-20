package JavaFundamentals.Lesson01LabFromBasics;

import java.util.Scanner;
public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isValid = number >= 1 && number <= 100;

        if (isValid) {
            for (int i = 1; i <= 10; i++) {
                int product = number * i;
                System.out.println(number + " X " + i + " = " + product);
            }
        }
    }
}
