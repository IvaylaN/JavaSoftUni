package JavaBasics.Lesson01;
import java.util.Scanner;
public class Ex04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPages = Integer.parseInt(scanner.nextLine());
        int countOfPagesPerHour = Integer.parseInt(scanner.nextLine());
        int countOfDays = Integer.parseInt(scanner.nextLine());

        int countOfHoursPerDay = (countOfPages / countOfPagesPerHour )/ countOfDays;
        System.out.println(countOfHoursPerDay);

    }
}
