package JavaBasics.Lesson02;
import java.util.Scanner;
public class Ex03TimePls15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = hours * 60 + minutes + 15;

        int hour = allMinutes / 60;
        int minute = allMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }

        if (minute < 10) {
            System.out.printf("%d:0%d", hour, minute);
        } else {
            System.out.printf("%d:%d", hour, minute);
        }

    }

}
