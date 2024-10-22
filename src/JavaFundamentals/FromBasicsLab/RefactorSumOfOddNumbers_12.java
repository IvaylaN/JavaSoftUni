package JavaFundamentals.FromBasicsLab;

import java.util.Scanner;
public class RefactorSumOfOddNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(currentNumber);
            sum += currentNumber;
            currentNumber += 2;
        }

        System.out.printf("Sum: %d%n", sum);
    }
}