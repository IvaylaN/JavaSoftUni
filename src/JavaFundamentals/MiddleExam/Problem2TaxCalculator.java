package JavaFundamentals.MiddleExam;

import java.util.Scanner;

public class Problem2TaxCalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();
        String[] vehicles = input.split(">>");

        double totalTaxCollected = 0;

        for (String vehicle : vehicles) {
            String[] vehicleData = vehicle.split("\\s+");
            String carType = vehicleData[0];
            int years = Integer.parseInt(vehicleData[1]);
            int kilometers = Integer.parseInt(vehicleData[2]);

            double tax = 0;
            boolean validCar = true;

            switch (carType) {
                case "family":
                    tax = 50 - (years * 5) + ((kilometers / 3000) * 12);
                    break;
                case "heavyDuty":
                    tax = 80 - (years * 8) + ((kilometers / 9000) * 14);
                    break;
                case "sports":
                    tax = 100 - (years * 9) + ((kilometers / 2000) * 18);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    validCar = false;
                    break;
            }

            if (validCar) {
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, tax);
                totalTaxCollected += tax;
            }
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalTaxCollected);
    }
}


