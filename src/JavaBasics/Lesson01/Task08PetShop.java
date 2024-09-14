package JavaBasics.Lesson01;
import java.util.Scanner;
public class Task08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDogFood = Integer.parseInt(scanner.nextLine());
        int countCatFood = Integer.parseInt(scanner.nextLine());
        double sumDogFood = countDogFood * 2.50;
        double sumCatFood = countCatFood * 4.00;
        double totalSum = sumDogFood + sumCatFood;
        System.out.println(totalSum + " lv.");
    }
}
