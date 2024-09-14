package JavaBasics.Lesson05;

import java.util.Scanner;

public class Task02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String currentPassword = scanner.nextLine();

        while (!currentPassword.equals(password)) {
            currentPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}


