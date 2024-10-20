package JavaBasics.ExamPreparation;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int first1 = first / 1000;
        int first2 = first / 100 % 10;
        int first3 = first / 10 % 10;
        int first4 = first % 10;

        int second1 = second / 1000;
        int second2 = second / 100 % 10;
        int second3 = second / 10 % 10;
        int second4 = second % 10;

        for (int num1 = first1; num1 <= second1; num1++) {
            for (int num2 = first2; num2 <= second2; num2++) {
                for (int num3 = first3; num3 <= second3; num3++) {
                    for (int num4 = first4; num4 <= second4; num4++) {

                        if ( num1 % 2 != 0
                                & num2 % 2 != 0
                                & num3 % 2 != 0
                                & num4 % 2 != 0) {
                            System.out.printf("%d%d%d%d ", num1, num2, num3, num4);
                        }
                    }
                }
            }
        }
    }
}
