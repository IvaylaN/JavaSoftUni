package JavaBasics.Lesson04;

import java.util.Scanner;

public class Ex04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int countToys = 0;
        int savedMoney = 0;

        for (int currentAge = 1; currentAge <= age; currentAge++){
            if (currentAge % 2 == 0){
                savedMoney += 10;
                sum += savedMoney;
                sum--;
            } else {
                countToys++;
            }
        }
        sum += countToys * priceToy;

        double diff = Math.abs(sum - priceWashingMachine);
        if (sum >= priceWashingMachine){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}



