package JavaBasics.Lesson02;

import java.util.Scanner;
public class Ex07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardPcs = Integer.parseInt(scanner.nextLine());
        int processorsPcs = Integer.parseInt(scanner.nextLine());
        int ramMemoryPcs = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCardPcs * 250;
        double processorsPrice = (videoCardPrice * 0.35) * processorsPcs;
        double ramMemoryPrice = (videoCardPrice * 0.10) * ramMemoryPcs;

        double totalPrice = videoCardPrice + processorsPrice + ramMemoryPrice;

        if (videoCardPcs > processorsPcs) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!%n", diff);
        }
    }
}
