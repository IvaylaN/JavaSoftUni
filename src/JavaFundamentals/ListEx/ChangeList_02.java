package JavaFundamentals.ListEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ChangeList_02 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            List<Integer> numbers = new ArrayList<>();

            String[] inputArr = scanner.nextLine().split("\\s+");

            for (String element : inputArr) {
                numbers.add(Integer.parseInt(element));
            }

            String command = scanner.nextLine();
            while (!command.equals("end")) {
                String[] commandData = command.split("\\s+");
                String commandName = commandData[0];

                switch (commandName) {
                    case "Delete":
                        int elementToDelete = Integer.parseInt(commandData[1]);
                        numbers.removeIf(n -> n == elementToDelete);
                        break;
                    //case "Delete":
                    //int elementToDelete = Integer.parseInt(commandData[1]);
                    //for (int i = 0; i < numbers.size(); i++) {
                    //if (numbers.get(i) == elementToDelete) {
                    //numbers.remove(i);
                    //i--; // Adjust the index after removal
                    //}
                    //}
                    case "Insert":
                        int elementToInsert = Integer.parseInt(commandData[1]);
                        int position = Integer.parseInt(commandData[2]);
                        if (position >= 0 && position <= numbers.size()) {
                            numbers.add(position, elementToInsert);
                        }
                        break;
                }

                command = scanner.nextLine();
            }

            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
}



