package JavaFundamentals.MidExamPrep;


import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean noEnoughEnergy = false;
        int countWonBattles = 0;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            initialEnergy -= distance;

            if (initialEnergy < 0) {
                initialEnergy += distance;
                noEnoughEnergy = true;
                break;
            } else {
                countWonBattles++;
            }

            if (countWonBattles % 3 == 0) {
                initialEnergy += countWonBattles;
            }
            command = scanner.nextLine();
        }

            if (noEnoughEnergy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWonBattles, initialEnergy);
            } else {
                System.out.printf("Won battles: %d. Energy left: %d", countWonBattles, initialEnergy);
            }

        }
    }

