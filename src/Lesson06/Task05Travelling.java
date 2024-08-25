package Lesson06;

import java.util.Scanner;
public class Task05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double excursionPrice = Double.parseDouble(scanner.nextLine());

            double availableMoney = 0; // слагаме я в основния while цикъл, защото събираме пари за всяка екскурзия отделно. Ако е отвън ще натрупва
            while (availableMoney < excursionPrice){
                double saveMoney = Double.parseDouble(scanner.nextLine());
                availableMoney = availableMoney + saveMoney;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
