/*
package JavaFundamentals.Array.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        String command = scanner.nextLine();
        while(!command.equals("end")){
            if(command.contains("swap")){
                int position1 =  ;
                int position2 =  ;

                int firstNumber = numbers[position1];
                int secondNumber = numbers[position2];

                numbers[position1] = secondNumber;
                numbers[position2] = firstNumber;

            }else if (command.contains("multiply")){

            } else if (command.contains("decrease")){

            }


            command = scanner.nextLine();
        }


    }
}
*/
