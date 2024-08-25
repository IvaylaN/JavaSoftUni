package Lesson05;

import java.util.Scanner;

public class Task06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;
        while (!text.equals("Stop")) {
            int number = Integer.parseInt(text);
            if (number > maxNumber) {
                maxNumber = number;
            }
            text = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
