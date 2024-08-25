package Lesson05;

import java.util.Scanner;

public class Task07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int minValue = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number < minValue) {
                minValue = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minValue);
    }
}

