package Lesson01;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");*/

        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, tokens);

        while(stack.size()>1 ) {
            int firstNum = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            int result = 0;
            if (operator.equals("+")) {
                result = firstNum + secondNum;
            } else {
                result = firstNum - secondNum;
            }
            stack.push(String.valueOf(result));
        }
        System.out.println(stack.peek());





    }
}
