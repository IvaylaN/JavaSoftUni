package JavaFundamentals.MidExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double averageValue = sum * 1.0 / numbers.size();

        List<Integer> greaterNumber = new ArrayList<>();
        for (int number : numbers) {
            if (number > averageValue) {
                greaterNumber.add(number);
            }
        }
        Collections.sort(greaterNumber);
        Collections.reverse(greaterNumber);

        if (greaterNumber.isEmpty()) {
            System.out.println("No");
        } else {
            if (greaterNumber.size() <= 5) {
                for (int number : greaterNumber) {
                    System.out.print(number + " ");
                }
            } else {
                for (int i = 0; i <= 4; i++) {
                    System.out.print(greaterNumber.get(i) + " ");

                }
            }


        }
    }
}
