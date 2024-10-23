package JavaFundamentals.ListEx;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());




        String command = scanner.nextLine();

        while (!command.equals("End")){
            String [] commandData = command.split("\\s+");
            String commandName = commandData [0];

            switch (commandName){
                case "Add" -> {
                    int numberToAdd = Integer.parseInt(commandData[1]);
                    numbers.add(numberToAdd);
                }
                case "Insert" -> {

                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int index = Integer.parseInt(commandData[2]);

                    boolean isValidIndex = checkIfIndexIsValid(index, numbers.size() - 1);


                    if(isValidIndex){
                        numbers.add(index, numberToInsert);
                    }else {
                        System.out.println("Invalid index");
                    }

                }

                case "Remove" -> {


                    int indexToRemove = Integer.parseInt(commandData[1]);
                    boolean isValidIndex = checkIfIndexIsValid(indexToRemove, numbers.size() - 1);

                    if(isValidIndex){
                        numbers.remove(indexToRemove);
                    }else {
                        System.out.println("Invalid index");
                    }
                }

                case "Shift" ->{



                    String shiftType = commandData[1];
                    int count = Integer.parseInt(commandData[2]);

                    if(shiftType.equals("left")){
                        shiftLeft(numbers, count);
                    }else if(shiftType.equals("right")){

                        shiftRight(numbers, count);
                    }
                }
            }





            command = scanner.nextLine();
        }

        for (int number : numbers){
            System.out.print(number + " ");
        }

    }

    private static void shiftLeft(List<Integer> numbers, int count){
        for (int i = 1; i <= count ; i++) {


            int firstElement = numbers.get(0);
            numbers.add(firstElement);
            numbers.remove(0);

        }
    }


    private static void shiftRight(List<Integer> numbers, int count){
        for (int i = 1; i <= count ; i++) {


            int lastElement = numbers.get(numbers.size() - 1);
            numbers.add(0, lastElement);
            numbers.remove(numbers.size() - 1);

        }
    }

    private static boolean checkIfIndexIsValid(int index, int lastIndex) {

        return index >= 0 && index <= lastIndex;
    }


}