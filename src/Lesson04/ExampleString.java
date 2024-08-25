package Lesson04;

import java.util.Scanner;

public class ExampleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        for (int firstLetter = 0; firstLetter < name.length(); firstLetter ++) {
            char letter = name.charAt(firstLetter);
            System.out.println(letter);
        }
    }
}
