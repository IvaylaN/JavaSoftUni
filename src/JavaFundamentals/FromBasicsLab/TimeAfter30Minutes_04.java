package JavaFundamentals.FromBasicsLab;

import java.util.Scanner;
public class TimeAfter30Minutes_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentHour = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutesAfter30Minutes = (currentHour * 60) + currentMinutes + 30;

        int finalHours = totalMinutesAfter30Minutes / 60;
        int finalMinutes = totalMinutesAfter30Minutes % 60;

        if(finalHours > 23){
            finalHours = 0;
        }
        System.out.printf("%d:%02d", finalHours, finalMinutes);
    }
}





