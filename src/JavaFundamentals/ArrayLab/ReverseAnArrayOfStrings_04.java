package JavaFundamentals.ArrayLab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        for (int i = 0; i < elements.length / 2; i++) {
            String currentElement = elements[i];
            int currentIndex = elements.length - 1 - i;

            elements[i] = elements[currentIndex];
            elements[currentIndex] = currentElement;

        }
        System.out.println(String.join(" ", elements));

    }
}
