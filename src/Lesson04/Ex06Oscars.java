package Lesson04;

import java.util.Scanner;

public class Ex06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int countExaminers = Integer.parseInt(scanner.nextLine());

        double sumAllPoints = 0;
        for (int i = 1; i <= countExaminers; i++) {
            String examinerName = scanner.nextLine();
            double personPoints = Integer.parseInt(scanner.nextLine());

            sumAllPoints = academyPoints + examinerName.length() * personPoints / 2;
            if (sumAllPoints >= 1250) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, sumAllPoints);
                break;
            }

        if (sumAllPoints < 1250.5) {
            double diff = 1250.5 - sumAllPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
            }
        }
    }
}
