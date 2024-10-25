package JavaFundamentals.Array.Ex;

import java.util.Scanner;
public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int row = 1; row <= n; row++) {
            String input = scanner.nextLine();
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if (row % 2 == 0) {
                secondArray[row - 1] = firstNumber;
                firstArray[row - 1] = secondNumber;
            } else {
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            }
        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
