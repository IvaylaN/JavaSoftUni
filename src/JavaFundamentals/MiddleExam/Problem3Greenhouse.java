package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3Greenhouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list of crops
        String[] initialCrops = scanner.nextLine().split(" & ");
        List<String> crops = new ArrayList<>();
        Collections.addAll(crops, initialCrops);

        // Process commands
        String command = scanner.nextLine();
        while (!command.equals("Collect!")) {
            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];

            switch (action) {
                case "Plant":
                    String cropToPlant = commandParts[1];
                    if (!crops.contains(cropToPlant)) {
                        crops.add(0, cropToPlant);
                    }
                    break;
                case "Transplant":
                    String cropToTransplant = commandParts[1];
                    if (crops.contains(cropToTransplant)) {
                        crops.remove(cropToTransplant);
                        crops.add(cropToTransplant);
                    }
                    break;
                case "Replace":
                    int cropIndex1 = Integer.parseInt(commandParts[1]);
                    int cropIndex2 = Integer.parseInt(commandParts[2]);
                    if (cropIndex1 >= 0 && cropIndex1 < crops.size() && cropIndex2 >= 0 && cropIndex2 < crops.size()) {
                        Collections.swap(crops, cropIndex1, cropIndex2);
                    }
                    break;
                case "Uproot":
                    String cropToUproot = commandParts[1];
                    crops.remove(cropToUproot);
                    break;
            }

            command = scanner.nextLine();
        }

        // Print the final state of the greenhouse collection
        System.out.println(String.join(" | ", crops));
    }
}

