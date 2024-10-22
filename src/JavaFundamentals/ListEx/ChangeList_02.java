package JavaFundamentals.ListEx;

import java.util.ArrayList;
import java.util.Scanner;
public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputArr = sc.nextLine().split("\\s+");
        ArrayList<String> numbers = new ArrayList<>();
        for (String element : inputArr) {
            numbers.add(element);
        }
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Delete":
                    while (numbers.contains(tokens[1])) {
                        numbers.remove(tokens[1]);
                    }
                    break;
                case "Insert":
                    String element = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (index < numbers.size()) {
                        numbers.add(index, element);
                    }
                    break;
            }
            input = sc.nextLine();
        }
        System.out.print(String.join(" ", numbers));
    }
}



