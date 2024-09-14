package JavaBasics.Lesson01;
import java.util.Scanner;
public class Ex06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sqMeterNylon = Integer.parseInt(scanner.nextLine());
        int litersPaint = Integer.parseInt(scanner.nextLine());
        int litersThinner = Integer.parseInt(scanner.nextLine());
        int hoursWorkers = Integer.parseInt(scanner.nextLine());

        double sumNylon = (sqMeterNylon + 2) * 1.50;
        double sumPaint = (litersPaint * 1.10) * 14.50;
        double sumThinner = litersThinner * 5;
        double sumPackages = 0.40;

        double sumMaterials = sumNylon + sumPaint + sumThinner + sumPackages;
        double sumWorkers = (sumMaterials * 0.3) * hoursWorkers;
        System.out.println(sumMaterials + sumWorkers);
    }
}