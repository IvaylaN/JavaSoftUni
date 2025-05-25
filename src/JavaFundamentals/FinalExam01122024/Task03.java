package FinalExam01122024;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordPairs = scanner.nextLine().split(" \\| ");
        Map<String, List<String>> notebook = new LinkedHashMap<>();
        for (String pair : wordPairs) {
            String[] parts = pair.split(": ");
            String word = parts[0];
            String definition = parts[1];

            notebook.putIfAbsent(word, new ArrayList<>());
            notebook.get(word).add(definition);
        }


        String[] testWords = scanner.nextLine().split(" \\| ");
        String command = scanner.nextLine();

        if (command.equals("Test")) {
            for (String word : testWords) {
                if (notebook.containsKey(word)) {
                    System.out.println(word + ":");
                    for (String definition : notebook.get(word)) {
                        System.out.println(" -" + definition);
                    }
                }
            }
        } else if (command.equals("Hand Over")) {
            System.out.println(String.join(" ", notebook.keySet()));
        }


    }
}
