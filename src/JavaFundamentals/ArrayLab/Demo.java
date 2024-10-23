package JavaFundamentals.ArrayLab;

import java.util.Scanner;
import java.util.Arrays;
public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] days = new int[7];

        System.out.println(days.length);

        //добавяне на елементи в масива Вариант 1 - когато не знаем кои са елементите
        days[0] = 1;
        days[1] = 2;
        days[2] = 3;

        //достъпване на последния елемент
        System.out.println(days[days.length - 1]);

        String[] monts = new String[12];
        System.out.println(monts.length);

        //достъпване на елемент
        System.out.println(days[0]);// принтираме числото 1 -> позиция 0

        String name = "Stoyan";

        //"Stoyan".toCharArray() -> ['S', 't', 'o', 'y', 'a', 'n']
        char[] letters = name.toCharArray();


        System.out.println(letters[letters.length - 1]);

        //Създаване на масив ако знаем предварително стойностите, които искаме да запазим - Вариант 2
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Пример как можем да форматираме елемнти
        System.out.println(weekDays[0]);

        String[] students = new String[20];

        students[0] = "Ivancho";
        students[1] = "Goshko";
        students[2] = "Pepi";

        System.out.println();

        for (int i = 0; i < weekDays.length; i++) {

            System.out.println(weekDays[i]);
        }

        //while, for - повтарят действия

        //Foreach -> повтаря действие, служи, за да обхождаме колекции
        //При създаване на променливат (day) -> типът на променливата трябва да е идентичен с този на елементите в масива

        for (String day : weekDays) {

            System.out.println(day);
        }

        for (int currentDay : days) {

            System.out.println(currentDay);
        }

        //Вариант 1 за запълване на масив
        int[] numbers = {1, 10, 20, 30};

        //Вариант 2 за запълване на масив
        int[] counts = new int[4];

        counts[0] = 100;
        counts[1] = 200;
        counts[2] = 300;
        counts[3] = Integer.parseInt(scanner.nextLine());


        //Вариант 4 за запълване на масив
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        for (int position = 0; position < arr.length; position++) {
            arr[position] = Integer.parseInt(scanner.nextLine());

            //Вариант 4 за запълване на масив

            String input = "1 2 3 4 5";
            String example = "1,2,3,4,5";// -> example.split(",") -> ["1", "2", "3", "4", "5"]

            String[] names = scanner.nextLine().split(" ");

            String[] nums = input.split(" "); //-> ["1", "2", "3", "4", "5"] -> получаваме масив от Стрингове

            int[] numbers2 = Arrays.stream(scanner.nextLine()
                            .split(" "))//-> ["1", "2", "3", "4", "5"] -> получаваме масив от Стрингове
                    .mapToInt(Integer::parseInt) // -> [1, 2, 3, 4, 5] -> преминаваме през всеки елемент и го преобразуваме в цяло число
                    .toArray();// запазваме получия резултат към масива

            double[] salaries = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

        /*for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }*/

        /*

        1. Масивът е съвкупност от еднотипни елементи
        2. Масивът има постоянна дължина - статичен
        3. Дължината на масива = броя елементи в него
        4. позиции/индекси -> започваме от 0 до дължината - 1
        5. Задаваме стойност на елемент: array[0] = 99
        6. Достъпваме елемент в масив -> array[10] - достъпваме елемента на индекс 10
        7. Foreach - обхождаме масив последавателно от първия до последния елемент
        8. For - обхождаме масив, когато ни трябва да работим с конкретен индекс
        9. Пълнене на масиви -> Demo1 Вариант1, Вариант2, Вариант3, Demo2 Вариант4


             */
        }
    }
}


