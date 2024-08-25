package ExamPrep;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double dogEatenFood = 0;
        double catEatenFood = 0;
        double allBiscuitsInGr = 0;
        for (int day = 1; day <= days; day++) {

            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());

            dogEatenFood = dogEatenFood + dogFood;
            catEatenFood = catEatenFood + catFood;

            if (day % 3 == 0) {
                double bonusFood = (dogFood + catFood) * 0.10;
                allBiscuitsInGr = allBiscuitsInGr + bonusFood;
            }

        }

        double totalEatenFood = dogEatenFood + catEatenFood;
        double percentageEatenFood = totalEatenFood / totalFood * 100;
        double percentageDog = dogEatenFood / totalEatenFood * 100;
        double percentageCat = catEatenFood / totalEatenFood * 100;


        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(allBiscuitsInGr));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentageCat);
    }
}
