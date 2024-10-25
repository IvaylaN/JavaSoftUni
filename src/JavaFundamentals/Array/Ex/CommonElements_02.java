package JavaFundamentals.Array.Ex;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArray = firstRow.split(" ");
        String[] secondArray = firstRow.split(" ");

        for(String el2 : secondArray){
            for(String el1 : firstArray){
                if(el1.equals(el2)){
                    System.out.print(el2 + " ");
                }
            }
        }


    }
}
