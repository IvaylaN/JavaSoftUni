package JavaFundamentals.ListLab;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")){
            String [] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int numberToRemoveAt = Integer.parseInt(commandParts[1]);
                    numbers.remove(numberToRemoveAt);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int position = Integer.parseInt(commandParts[2]);
                    numbers.add(position, numberToInsert);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
