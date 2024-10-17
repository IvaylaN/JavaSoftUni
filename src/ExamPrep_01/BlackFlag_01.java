package ExamPrep_01;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalCountPlunders = 0;

        for (int i = 1; i <= days ; i++) {
            totalCountPlunders += dailyPlunder;

            if(i % 3 == 0){
                double additionalPlunder = dailyPlunder * 0.5;
                totalCountPlunders += additionalPlunder;
            }

            if(i % 5 == 0){
                totalCountPlunders = totalCountPlunders - 0.30 * totalCountPlunders;
                //totalCountPlunders = totalCountPlunders * 0.70;
                //totalCountPlunders *= 0.70;
            }
        }

        if(totalCountPlunders >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalCountPlunders);
        } else {
            double percentage = totalCountPlunders / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
