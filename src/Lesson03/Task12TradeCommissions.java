package Lesson03;

import java.util.Scanner;

public class Task12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double comision = 0;
        boolean validInput = true;

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                comision = sales * 0.05;
            } else if (sales > 500 && sales <= 1000) {
                comision = sales * 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                comision = sales * 0.08;
            } else if (sales > 10000) {
                comision = sales * 0.12;
            }else {
                validInput = false;
            }
        } else if (city.equals("Varna")){
            if (sales >= 0 && sales <= 500) {
                comision = sales * 0.045;
            } else if (sales > 500 && sales <= 1000) {
                comision = sales * 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                comision = sales * 0.10;
            } else if (sales > 10000) {
                comision = sales * 0.13;
            }else {
                validInput = false;
            }
        } else if (city.equals("Plovdiv")){
            if (sales >= 0 && sales <= 500) {
                comision = sales * 0.055;
            } else if (sales > 500 && sales <= 1000) {
                comision = sales * 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                comision = sales * 0.12;
            } else if (sales > 10000) {
                comision = sales * 0.145;
            } else {
                validInput = false;
            }
        } else {
            validInput = false;
        }

        if (validInput) {
            System.out.printf("%.2f", comision);
        } else {
            System.out.println("error");
        }
    }
}
