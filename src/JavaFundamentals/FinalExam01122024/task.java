package FinalExam01122024;

import java.util.Scanner;
import java.util.regex.*;

public class task {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([*^]+[a-zA-Z\\s]{6,}[*^]+)[^a-zA-Z0-9]*\\+{2,}([-\\d.]+,[-\\d.]+)\\+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean found = false;

        while (matcher.find()) {
            String artifactName = matcher.group(1);
            String coordinates = matcher.group(2);


            artifactName = artifactName.replaceAll("^[*^]+|[*^]+$", "").trim();


            System.out.printf("Found %s at coordinates %s.%n", artifactName, coordinates);
            found = true;
        }

        if (!found) {
            System.out.println("No valid artifacts found.");
        }

    }
}
