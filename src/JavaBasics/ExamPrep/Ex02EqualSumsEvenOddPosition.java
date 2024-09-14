package JavaBasics.ExamPrep;

import java.util.Scanner;

public class Ex02EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++){

            int evenPositionSum = 0;
            int oddPositionSum = 0;

            int number = currentNumber;

            int position = 1;

            while (number > 0){

                int currentDigit = number % 10;

                if (position % 2 == 0){
                    evenPositionSum += currentDigit;
                } else {
                    oddPositionSum += currentDigit;
                }

                number = number / 10;
                position++;


            }

            if (evenPositionSum == oddPositionSum){
                System.out.print(currentNumber + " ");
            }


        }



    }

}
