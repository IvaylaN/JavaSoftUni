package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3PhoneShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list of phones
        String[] initialPhones = scanner.nextLine().split(", ");
        List<String> phoneStorage = new ArrayList<>();
        for (String phone : initialPhones) {
            phoneStorage.add(phone);
        }

        // Process commands
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" - ");
            String action = commandParts[0];
            String phone = commandParts[1];

            switch (action) {
                case "Add":
                    if (!phoneStorage.contains(phone)) {
                        phoneStorage.add(phone);
                    }
                    break;
                case "Remove":
                    phoneStorage.remove(phone);
                    break;
                case "Bonus phone":
                    String[] phones = phone.split(":");
                    String oldPhone = phones[0];
                    String newPhone = phones[1];
                    int oldPhoneIndex = phoneStorage.indexOf(oldPhone);
                    if (oldPhoneIndex != -1) {
                        phoneStorage.add(oldPhoneIndex + 1, newPhone);
                    }
                    break;
                case "Last":
                    if (phoneStorage.remove(phone)) {
                        phoneStorage.add(phone);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        // Print the final state of the phone storage
        System.out.println(String.join(", ", phoneStorage));
    }
}
