package JavaFundamentals.Lesson01LabFromBasics;

import java.util.Scanner;
public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        String language = switch (country){
            case "USA", "England" ->  "English";
            case "Spain", "Argentina", "Mexico" -> "Spanish";
            default ->  "unknown";
        };
        System.out.println(language);
    }
}
