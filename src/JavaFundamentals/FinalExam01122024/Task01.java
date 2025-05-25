package FinalExam01122024;

import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        String command;
        while (!(command = scanner.nextLine()).equals("Complete")) {
            String[] parts = command.split(" ");
            String action = parts[0];

            switch (action) {
                case "Make":
                    String caseType = parts[1];
                    int index = Integer.parseInt(parts[2]);
                    if (caseType.equals("Upper")) {
                        char upperChar = Character.toUpperCase(password.charAt(index));
                        password = password.substring(0, index) + upperChar + password.substring(index + 1);
                        System.out.println(password);
                    } else if (caseType.equals("Lower")) {
                        char lowerChar = Character.toLowerCase(password.charAt(index));
                        password = password.substring(0, index) + lowerChar + password.substring(index + 1);
                        System.out.println(password);
                    }
                    break;

                case "Insert":
                    index = Integer.parseInt(parts[1]);
                    char charToInsert = parts[2].charAt(0);
                    if (index >= 0 && index <= password.length()) {
                        password = password.substring(0, index) + charToInsert + password.substring(index);
                        System.out.println(password);
                    }
                    break;

                case "Replace":
                    char charToReplace = parts[1].charAt(0);
                    int value = Integer.parseInt(parts[2]);
                    if (password.indexOf(charToReplace) != -1) {
                        char newChar = (char) (charToReplace + value);
                        password = password.replace(charToReplace, newChar);
                        System.out.println(password);
                    }
                    break;

                case "Validation":
                    validatePassword(password);
                    break;

                default:
                    // Ignore invalid commands
                    break;
            }
        }
    }

    private static void validatePassword(String password) {
        boolean isValid = true;

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long!");
            isValid = false;
        }

        if (!password.matches("[a-zA-Z0-9_]+")) {
            System.out.println("Password must consist only of letters, digits and _!");
            isValid = false;
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must consist at least one uppercase letter!");
            isValid = false;
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must consist at least one lowercase letter!");
            isValid = false;
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must consist at least one digit!");
            isValid = false;
        }

        if (isValid) {
            System.out.println();
        }
    }
}

