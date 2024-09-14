package JavaBasics.ExamFirstTry;

import java.util.Scanner;

public class DeerOfSanta_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int daysMissingSanta = Integer.parseInt(scanner.nextLine());
        int leftFoodKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayAnimal1Kg = Double.parseDouble(scanner.nextLine());
        double foodPerDayAnimal2Kg = Double.parseDouble(scanner.nextLine());
        double foodPerDayAnimal3Kg = Double.parseDouble(scanner.nextLine());

        double neededFoodAnimal1 = foodPerDayAnimal1Kg * daysMissingSanta;
        double neededFoodAnimal2 = foodPerDayAnimal2Kg * daysMissingSanta;
        double neededFoodAnimal3 = foodPerDayAnimal3Kg * daysMissingSanta;

        double allNeededFood = neededFoodAnimal1 + neededFoodAnimal2 +neededFoodAnimal3;



        if(leftFoodKg >= allNeededFood){
           int diff = Math.toIntExact(Math.abs(Math.round(Math.floor(leftFoodKg - allNeededFood))));
            System.out.printf("%d kilos of food left.", diff);
        }else {
            int diff = Math.toIntExact(Math.abs(Math.round(Math.ceil(allNeededFood - leftFoodKg))));
            System.out.printf("%d more kilos of food are needed.", diff);
        }

    }


}
