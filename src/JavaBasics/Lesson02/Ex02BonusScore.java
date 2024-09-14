package JavaBasics.Lesson02;

import java.util.Scanner;

public class Ex02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (initialNumber <= 100) {
            bonus = 5;
        } else  if ( initialNumber <= 1000){
            bonus = initialNumber * 0.20;
        } else  {
            bonus = initialNumber * 0.10;
        }

        if (initialNumber % 2 == 0) {
            bonus = bonus + 1;
        }else if (initialNumber % 10 == 5){
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(initialNumber + bonus);
    }
}
