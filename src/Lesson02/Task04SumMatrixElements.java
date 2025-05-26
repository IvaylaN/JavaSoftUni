package Lesson02;

import java.util.Arrays;
import java.util.Scanner;

public class Task04SumMatrixElements {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int[] size = Arrays.stream(scanner.nextLine().split(", "))
            .mapToInt(Integer::parseInt)
            .toArray();

    int rows = size[0];
    int cols = size[1];

    int[][] matrix = new int[rows][cols];

    fillMatrix(matrix, scanner);
    System.out.println(rows);
    System.out.println(cols);
    System.out.println(getSum(matrix));

}

    private static int getSum(int[][] matrix) {
      int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum+=matrix[row][col];
            }

        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            /*for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();*/

                int[] currentRow = Arrays.stream(scanner.nextLine().split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                matrix[row] = currentRow;
            }
        }

    }