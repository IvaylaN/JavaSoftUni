package Lesson04;

import java.util.Scanner;
public class Ex08TennisRanklist {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int countTournaments = Integer.parseInt(scanner.nextLine());
    int startingPoints = Integer.parseInt(scanner.nextLine());

    String currentStage = "";
    int tournamentPoints = startingPoints;
    int wins = 0;

    for (int i = 0; i < countTournaments; i++){
    currentStage = scanner.nextLine();

        if (currentStage.equals("W")){
            tournamentPoints += 2000;
            wins++;
        } else if (currentStage.equals("F")) {
            tournamentPoints += 1200;
        } else if (currentStage.equals("SF")) {
            tournamentPoints += 720;
        }
    }
    int averagePoints = (tournamentPoints - startingPoints) / countTournaments;

    double percentWins = (1.0 * wins  / countTournaments) * 100;
    System.out.printf("Final points: %d%n", tournamentPoints);
    System.out.printf("Average points: %d%n", averagePoints);
    System.out.printf("%.2f%%", percentWins);
    }
}
