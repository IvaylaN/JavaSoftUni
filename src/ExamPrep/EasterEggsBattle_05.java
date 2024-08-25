package ExamPrep;

import java.util.Scanner;

public class EasterEggsBattle_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());

        boolean noMoreEgs = false;

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.equals("one")) {
                two--;
            } else {
                one--;
            }

            if (one == 0 || two == 0) {
                noMoreEgs = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (noMoreEgs && two > 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", two);
        } else if (noMoreEgs && one > 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", one);
        } else {
            System.out.printf("Player one has %d eggs left.%n", one);
            System.out.printf("Player two has %d eggs left.", two);
        }
    }
}
