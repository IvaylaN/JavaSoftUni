package Lesson02;

import java.util.Scanner;

public class Ex06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecFor1mDistance = Double.parseDouble(scanner.nextLine());

        double distance = distanceMeters * timeInSecFor1mDistance;
        double additionalTime = (Math.floor(distanceMeters/15) * 12.5);
        double totalTime = distance + additionalTime;

        double diff = Math.abs(recordInSec - totalTime);

        if (recordInSec > totalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.%n", diff);
        }
    }
}
