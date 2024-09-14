package JavaBasics.Lesson01;
import java.util.Scanner;
public class Task06ConcatenateData {
    public static void main(String[] args) {
        //"You are <firstName> <lastName>, a <age>-years old person from <town>."
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();;
        String lastName = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.print("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
    }
}
