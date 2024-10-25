package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chat = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split("\\s+", 2);
            String action = commandParts[0];

            switch (action) {
                case "Chat":
                    String messageToAdd = commandParts[1];
                    chat.add(messageToAdd);
                    break;
                case "Delete":
                    String messageToDelete = commandParts[1];
                    chat.remove(messageToDelete);
                    break;
                case "Edit":
                    String[] editParts = commandParts[1].split("\\s+", 2);
                    String messageToEdit = editParts[0];
                    String editedVersion = editParts[1];
                    int editIndex = chat.indexOf(messageToEdit);
                    if (editIndex != -1) {
                        chat.set(editIndex, editedVersion);
                    }
                    break;
                case "Pin":
                    String messageToPin = commandParts[1];
                    if (chat.remove(messageToPin)) {
                        chat.add(messageToPin);
                    }
                    break;
                case "Spam":
                    String[] spamMessages = commandParts[1].split("\\s+");
                    for (String spamMessage : spamMessages) {
                        chat.add(spamMessage);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (String message : chat) {
            System.out.println(message);
        }
    }
}

