package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem1ExperienceGaining {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the needed experience and the count of battles
            double neededExperience = Double.parseDouble(scanner.nextLine());
            int battleCount = Integer.parseInt(scanner.nextLine());

            double totalExperience = 0;
            int battlesPlayed = 0;

            // Process each battle
            for (int i = 1; i <= battleCount; i++) {
                double experience = Double.parseDouble(scanner.nextLine());

                // Apply bonuses and penalties
                if (i % 15 == 0) {
                    experience *= 1.05;
                } else if (i % 5 == 0) {
                    experience *= 0.90;
                } else if (i % 3 == 0) {
                    experience *= 1.15;
                }

                totalExperience += experience;
                battlesPlayed++;

                // Check if the needed experience is collected
                if (totalExperience >= neededExperience) {
                    System.out.printf("Player successfully collected his needed experience for %d battles.%n", battlesPlayed);
                    return;
                }
            }

            // If the needed experience is not collected
            double experienceNeeded = neededExperience - totalExperience;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.%n", experienceNeeded);
        }
    }

