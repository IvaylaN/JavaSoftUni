package Lesson01;
import java.util.Scanner;
public class Task07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int hours = 3;
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int totalHours = projectsCount * hours;
        System.out.println("The architect " + architectName + " will need " + totalHours + " hours to complete " + projectsCount + " project/s." );
    }
}
