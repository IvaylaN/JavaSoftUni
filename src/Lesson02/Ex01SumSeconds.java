package Lesson02;

import java.util.Scanner;

public class Ex01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int allSeconds = first + second + third;

        int minutes = allSeconds / 60;
        int seconds = allSeconds % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else  {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
