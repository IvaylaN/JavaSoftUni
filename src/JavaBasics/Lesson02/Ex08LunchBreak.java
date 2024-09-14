package JavaBasics.Lesson02;

import java.util.Scanner;

public class Ex08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String serialName = scanner.nextLine();
        int serialDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakDuration/8.0;
        double restTime = breakDuration/4.0;

        double totalTime = breakDuration - lunchDuration - restTime;


        if (totalTime >= serialDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(totalTime - serialDuration));
        } else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName,Math.ceil(serialDuration - totalTime));
        }
    }
}
