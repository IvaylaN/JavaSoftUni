package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem1JourneyToTheLegendaryArtifact {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the initial energy of the character
            double energy = Double.parseDouble(scanner.nextLine());
            int artifactPieces = 0;
            int mountainCount = 0;

            // Process each terrain
            String terrain = scanner.nextLine();
            while (!terrain.equals("Journey ends here!")) {
                switch (terrain) {
                    case "mountain":
                        energy -= 10;
                        mountainCount++;
                        if (mountainCount % 3 == 0) {
                            artifactPieces++;
                        }
                        break;
                    case "desert":
                        energy -= 15;
                        break;
                    case "forest":
                        energy += 7;
                        break;
                }

                // Check if the character's energy drops to zero or below
                if (energy <= 0) {
                    System.out.println("The character is too exhausted to carry on with the journey.");
                    return;
                }

                // Check if the character has collected all 3 pieces of the artifact
                if (artifactPieces == 3) {
                    System.out.printf("The character reached the legendary artifact with %.2f energy left.%n", energy);
                    return;
                }

                terrain = scanner.nextLine();
            }

            // If the journey ends without collecting all pieces
            if (artifactPieces < 3) {
                System.out.printf("The character could not find all the pieces and needs %d more to complete the legendary artifact.%n", 3 - artifactPieces);
            }
        }
    }

