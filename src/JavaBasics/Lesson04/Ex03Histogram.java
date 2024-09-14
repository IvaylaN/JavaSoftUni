package JavaBasics.Lesson04;

import java.util.Scanner;

public class Ex03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200) {
                countP1++;
            } else if (currentNumber <= 399) {
                countP2++;
            } else if (currentNumber <= 599) {
                countP3++;
            } else if (currentNumber <= 799) {
                countP4++;
            } else {
                countP5++;
            }
        }
        double p1Percent = (countP1 * 1.0 / n) * 100;
        double p2Percent = (countP2 * 1.0 / n) * 100;
        double p3Percent = (countP3 * 1.0 / n) * 100;
        double p4Percent = (countP4 * 1.0 / n) * 100;
        double p5Percent = (countP5 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%%n", p5Percent);
    }
}

