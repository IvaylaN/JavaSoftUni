package JavaBasics.Exam;

import java.util.Scanner;
public class MiningRig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int cablePrice = Integer.parseInt(scanner.nextLine());
        double energyPrice = Double.parseDouble(scanner.nextLine());
        double incomePerCard = Double.parseDouble(scanner.nextLine());

        double totalCardPrice = videoCardPrice * 13;
        double totalCablePrice = cablePrice * 13;
        double totalMoney = totalCablePrice + totalCardPrice + 1000;

        double totalMoneyPerDay = incomePerCard - energyPrice;
        double totalIncomePerDay = 13 * totalMoneyPerDay;
        double days = Math.ceil(totalMoney/totalIncomePerDay);

        System.out.printf("%.0f%n", totalMoney);
        System.out.printf("%.0f", days);
    }
}
