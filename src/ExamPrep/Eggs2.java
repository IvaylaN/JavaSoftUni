package ExamPrep;

import java.util.Scanner;

public class Eggs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsPlayerOne = scanner.nextInt();
        int eggsPlayerTwo = scanner.nextInt();

        while (true) {
            String command = scanner.nextLine();


            if (command.equals("End")) {
                System.out.println("Player one has " + eggsPlayerOne + " eggs left.");
                System.out.println("Player two has " + eggsPlayerTwo + " eggs left.");
                break;
            }


            if (command.equals("one")) {
                eggsPlayerTwo--;
            } else if (command.equals("two")) {
                eggsPlayerOne--;
            }


            if (eggsPlayerOne == 0) {
                System.out.println("Player one is out of eggs. Player two has " + eggsPlayerTwo + " eggs left.");
                break;
            }

            if (eggsPlayerTwo == 0) {
                System.out.println("Player two is out of eggs. Player one has " + eggsPlayerOne + " eggs left.");
                break;
            }
        }

    }
}
