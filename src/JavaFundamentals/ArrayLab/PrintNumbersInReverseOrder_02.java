package JavaFundamentals.ArrayLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumber = Integer.parseInt(scanner.nextLine());

        int [] numbers = new int [countNumber];

        for (int position = 0; position < numbers.length ; position++) {
            numbers[position] = Integer.parseInt(scanner.nextLine());



        }
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");


        }
    }
}