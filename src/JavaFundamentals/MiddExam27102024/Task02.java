package MiddExam27102024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> weaponParts = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\|")));
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Done")) {
                break;
            }
            String[] commandParts = command.split(" ");
            String action = commandParts[0];

            switch (action) {
                case "Add":
                    String particle = commandParts[1];
                    int addIndex = Integer.parseInt(commandParts[2]);
                    if (addIndex >= 0 && addIndex <= weaponParts.size()) {
                        weaponParts.add(addIndex, particle);
                    }
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(commandParts[1]);
                    if (removeIndex >= 0 && removeIndex < weaponParts.size()) {
                        weaponParts.remove(removeIndex);
                    }
                    break;
                case "Check":
                    String position = commandParts[1];
                    List<String> result = new ArrayList<>();
                    for (int i = 0; i < weaponParts.size(); i++) {
                        if ((position.equals("Even") && i % 2 == 0) ||
                                (position.equals("Odd") && i % 2 != 0)) {
                            result.add(weaponParts.get(i));
                        }
                    }
                    System.out.println(String.join(" ", result));
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
        System.out.println("You crafted " + String.join("", weaponParts) + "!");
    }
}


