package JavaBasics.Lesson04;

import java.util.Scanner;

public class Ex07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = scanner.nextInt();

        int musalaClimbers = 0;
        int montBlancClimbers = 0;
        int kilimanjaroClimbers = 0;
        int k2Climbers = 0;
        int everestClimbers = 0;

        int totalClimbers = 0;

        for (int i = 0; i < numberOfGroups; i++) {
            int groupSize = scanner.nextInt();
            totalClimbers += groupSize;

            if (groupSize <= 5) {
                musalaClimbers += groupSize;
            } else if (groupSize <= 12) {
                montBlancClimbers += groupSize;
            } else if (groupSize <= 25) {
                kilimanjaroClimbers += groupSize;
            } else if (groupSize <= 40) {
                k2Climbers += groupSize;
            } else {
                everestClimbers += groupSize;
            }
        }
        double musalaPercentage = (musalaClimbers / (1.0 * totalClimbers)) * 100;
        double montBlancPercentage = (montBlancClimbers / (1.0 * totalClimbers)) * 100;
        double kilimanjaroPercentage = (kilimanjaroClimbers / (1.0 * totalClimbers)) * 100;
        double k2Percentage = (k2Climbers / (1.0 * totalClimbers)) * 100;
        double everestPercentage = (everestClimbers / (1.0 * totalClimbers)) * 100;

        System.out.printf("%.2f%%%n", musalaPercentage);
        System.out.printf("%.2f%%%n", montBlancPercentage);
        System.out.printf("%.2f%%%n", kilimanjaroPercentage);
        System.out.printf("%.2f%%%n", k2Percentage);
        System.out.printf("%.2f%%%n", everestPercentage);
    }
}
