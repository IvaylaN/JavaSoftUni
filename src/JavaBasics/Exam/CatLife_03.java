package JavaBasics.Exam;

import java.util.Scanner;

public class CatLife_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeCat = scanner.nextLine();
        String sex = scanner.nextLine();

        int years = 0;

        if (sex.equals("m")) {
            switch (typeCat) {
                case "British Shorthair":
                    years = 13;
                    break;
                case "Siamese":
                    years = 15;
                    break;
                case "Persian":
                    years = 14;
                    break;
                case "Ragdoll":
                    years = 16;
                    break;
                case "American Shorthair":
                    years = 12;
                    break;
                case "Siberian":
                    years = 11;
                    break;
                /*default:
                    System.out.printf("%s is invalid cat!", typeCat);*/
            }

        } else if (sex.equals("f")) {
            switch (typeCat) {
                case "British Shorthair":
                    years = 14;
                    break;
                case "Siamese":
                    years = 16;
                    break;
                case "Persian":
                    years = 15;
                    break;
                case "Ragdoll":
                    years = 17;
                    break;
                case "American Shorthair":
                    years = 13;
                    break;
                case "Siberian":
                    years = 12;
                    break;
               /* default:
                    System.out.printf("%s is invalid cat!", typeCat);*/
            }
        }
        double peopleMonths = years * 12;
        double catMonts = Math.floor(peopleMonths / 6);

        if (typeCat.equals("British Shorthair")
                || typeCat.equals("Siamese")
                || typeCat.equals("Persian")
                || typeCat.equals("Ragdoll")
                || typeCat.equals("American Shorthair")
                || typeCat.equals("Siberian")) {
            System.out.printf("%.0f cat months", catMonts);

        } else {
            System.out.printf("%s is invalid cat!", typeCat);
        }
    }
}