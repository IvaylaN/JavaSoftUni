package Lesson04;

import java.util.Scanner;

public class Ex02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

            if (currentNumber > maxNumber){
                maxNumber = currentNumber;
            }
        }
        int sumWithoutMaxNumber = sum - maxNumber;
        if (sumWithoutMaxNumber == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNumber);
        } else {
            int diff = Math.abs(sumWithoutMaxNumber - sum);
            System.out.println("No");
        }
    }
}
