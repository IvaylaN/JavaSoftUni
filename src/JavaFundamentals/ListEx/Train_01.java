package JavaFundamentals.ListEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int wagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        List<String> command  = Arrays.stream(scanner.nextLine().split(" "))
                                       .collect(Collectors.toList());

        while (!command.get(0).equals("end")){
            if(command.get(0).equals("Add")){
                int wagonToAdd = Integer.parseInt(command.get(1));
                train.add(wagonToAdd);
            }else{
                int passengerToAdd = Integer.parseInt(command.get(0));
                for (int i = 0; i < train.size(); i++) {
                    int exactPass = passengerToAdd + train.get(i);
                    if(exactPass <= wagonMaxCapacity){
                        train.add(i, exactPass);
                        train.remove(i + 1);
                        break;
                    }
                }

            }
            command = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }

        for (Integer integer : train) {
            System.out.print(integer + " ");
        }





    }
}
