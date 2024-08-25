package Lesson06;

import java.util.Scanner;

public class Task04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isFound = false;
        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                count ++; // проверяваме коя поред е комбинацията
                int sum = i + j;
                if (sum == magicNumber){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    break;
                }
            }
            if (isFound){
                break;
            }
        }
        if(!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
