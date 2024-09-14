package JavaBasics.Lesson03;

import java.util.Scanner;
public class Task07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workingHour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        boolean isWorkingDay = day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday")
                || day.equals("Saturday");

        if (workingHour >= 10 && workingHour <= 18 && isWorkingDay){
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
