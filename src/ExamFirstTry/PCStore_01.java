package ExamFirstTry;

import java.util.Scanner;

public class PCStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceProcessorUSD = Integer.parseInt(scanner.nextLine());
        double priceVideoCardUSD = Integer.parseInt(scanner.nextLine());
        double priceRAMMemoryVideoCardUSD = Integer.parseInt(scanner.nextLine());
        int countRAMMemory = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());


        double priceProcessorLv = priceProcessorUSD * 1.57;
        double priceVideoCardLv = priceVideoCardUSD * 1.57;
        double priceRAMMemoryVideoCardLv = priceRAMMemoryVideoCardUSD * 1.57;

        double allRAM = priceRAMMemoryVideoCardLv * countRAMMemory;
        double discountPriceProcessor = priceProcessorLv -  (priceProcessorLv * percentDiscount);
        double discountPriceVideoCard = priceVideoCardLv - (priceVideoCardLv * percentDiscount );


        double totalSum = discountPriceProcessor + discountPriceVideoCard + allRAM;
        System.out.printf("Money needed - %.2f leva.", totalSum);
    }
}