package JavaFundamentals.ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int sumOfEvenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                sumOfEvenNumbers += numbers[i];
            }

        }
        System.out.println(sumOfEvenNumbers);

    }
}
