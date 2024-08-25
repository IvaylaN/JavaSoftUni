package Lesson03;

import java.util.Scanner;

public class Task08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

       /* if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
            System.out.println(12);
        } else if (day.equals("Wednesday") || day.equals("Thursday")) {
            System.out.println(14);
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println(16);
        }*/
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case"Wednesday" :
            case "Thursday":
                System.out.println(14);
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(16);
                break;
        }
    }
}