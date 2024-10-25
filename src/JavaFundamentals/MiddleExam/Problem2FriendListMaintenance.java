package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2FriendListMaintenance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list of friends
        String[] initialFriends = scanner.nextLine().split(", ");
        List<String> friends = new ArrayList<>();
        for (String friend : initialFriends) {
            friends.add(friend);
        }

        int blacklistedCount = 0;
        int lostCount = 0;

        // Process commands
        String command = scanner.nextLine();
        while (!command.equals("Report")) {
            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];

            switch (action) {
                case "Blacklist":
                    String nameToBlacklist = commandParts[1];
                    if (friends.contains(nameToBlacklist)) {
                        int index = friends.indexOf(nameToBlacklist);
                        friends.set(index, "Blacklisted");
                        blacklistedCount++;
                        System.out.println(nameToBlacklist + " was blacklisted.");
                    } else {
                        System.out.println(nameToBlacklist + " was not found.");
                    }
                    break;
                case "Error":
                    int errorIndex = Integer.parseInt(commandParts[1]);
                    if (errorIndex >= 0 && errorIndex < friends.size()) {
                        String nameAtErrorIndex = friends.get(errorIndex);
                        if (!nameAtErrorIndex.equals("Blacklisted") && !nameAtErrorIndex.equals("Lost")) {
                            friends.set(errorIndex, "Lost");
                            lostCount++;
                            System.out.println(nameAtErrorIndex + " was lost due to an error.");
                        }
                    }
                    break;
                case "Change":
                    int changeIndex = Integer.parseInt(commandParts[1]);
                    String newName = commandParts[2];
                    if (changeIndex >= 0 && changeIndex < friends.size()) {
                        String currentName = friends.get(changeIndex);
                        friends.set(changeIndex, newName);
                        System.out.println(currentName + " changed his username to " + newName + ".");
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        // Print the report
        System.out.println("Blacklisted names: " + blacklistedCount);
        System.out.println("Lost names: " + lostCount);
        System.out.println(String.join(" ", friends));
    }
}
