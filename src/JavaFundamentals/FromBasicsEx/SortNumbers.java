package JavaFundamentals.FromBasicsEx;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumebr = Integer.parseInt(scanner.nextLine());

        if (firstNumber >= secondNumber && firstNumber >= thirdNumebr) {
            System.out.println(firstNumber);
            if (secondNumber >= thirdNumebr) {
                System.out.println(secondNumber);
                System.out.println(thirdNumebr);
            } else {
                System.out.println(thirdNumebr);
                System.out.println(secondNumber);
            }
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumebr) {
            System.out.println(secondNumber);
            if (firstNumber >= thirdNumebr) {
                System.out.println(firstNumber);
                System.out.println(thirdNumebr);
            } else {
                System.out.println(thirdNumebr);
                System.out.println(firstNumber);
            }
        } else {
            System.out.println(thirdNumebr);
            if (firstNumber >= secondNumber) {
                System.out.println(firstNumber);
                System.out.println(secondNumber);
            } else {
                System.out.println(secondNumber);
                System.out.println(firstNumber);
            }
        }


    }
}
