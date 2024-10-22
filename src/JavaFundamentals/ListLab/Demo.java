package JavaFundamentals.ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(3);

        List<Double> decimalList = new ArrayList<>();

        List<String> stringList = new ArrayList<>();

        List<Character> charList = new ArrayList<>();


        integerList.add(45);
        integerList.add(57);
        integerList.add(12);
        integerList.add(4);

        decimalList.add(5.60);
        decimalList.add(5.00);

        stringList.add("Desi");
        stringList.add("Table");

        charList.add('y');

        //добавяне / вмъкване на елементи на конкретна позиция
        //integerList = {45, 57, 12, 4};
        integerList.add(1, 34);
        //integerList = {45, 34, 57, 12, 4}

        //размер на листа = колко е броя на елементите в листа
        System.out.println(integerList.size());
        System.out.println(decimalList.size());
        System.out.println(stringList.size());
        int size = charList.size();
        System.out.println(size);

        //създаваме списък с предварително дефинирани елементи
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));

        //!!! премахваме елемент от списък с цели числа
        numbers.remove(Integer.valueOf(40)); //премахва стойността на елемента
        numbers.remove(2); //премахва елемент от позиция 2

        //премахваме елемент от списък с дробни / текстове / символи
        decimalList.remove(5.60); //премахваме от списъка елемента 5.60
        decimalList.remove(1); //премахваме елемента на първа позиция

        stringList.remove("Desi"); //премахваме от списъка елемента "Desi"
        stringList.remove(0); //премахваме елемента на нулева позиция

        //замяна на елемент в списъка
        List<String> names = new ArrayList<>(Arrays.asList("Desi", "Valentin", "Rosen", "Petya"));
        names.set(1, "Ivan");
        //names = {"Desi", "Ivan", "Rosen", "Petya"}

        //достъпва елемент от конкретна позиция в списъка
        String name = names.get(1);
        System.out.println(names.get(2));

        //проверка дали даден елемент присъства в списъка
        //contains
        //true -> ако елементът го има в списъка
        //false -> ако елементът го няма в списъка
        System.out.println(names.contains("Peter"));
        boolean isContaining = names.contains("Ivan");
        System.out.println(isContaining);

        //обхождане на лист
        List<Double> grades = new ArrayList<>(Arrays.asList(5.60, 4.50, 3.45, 5.12));
        //1. for цикъл -> имаме нужда да знаем на коя позиция се намира всеки един елемент
        for (int position = 0; position <= grades.size() - 1; position++) {
            double grade = grades.get(position);
            System.out.println(grade);
            if (position % 2 == 0) {
                System.out.println("even position");
            }
        }
        //2. foreach -> имаме нужда само от елементите в листа без техните позиции
        for (double grade : grades) {
            System.out.println(grade);
        }

        //премахване на всички елементи в списъка
        //grades = {5.60, 4.50, 3.45, 5.12}
        System.out.println(grades.size()); //4
        grades.clear();
        //grades = {}
        System.out.println(grades.size()); //0

        //проверка за празен списък (размерът му е равен на 0 = няма елементи в него)
        //isEmpty
        //true -> списъкът е празен, size == 0
        //false -> списъкът не е празен, size > 0
        System.out.println(numbers.isEmpty());

        //намиране на позицията на елемент
        List<Integer> codes = new ArrayList<>(Arrays.asList(34, 12, 15, 87));
        //codes = {34, 12, 15, 87}
        int position = codes.indexOf(12); //1
        System.out.println(codes.indexOf(15)); // 2
        System.out.println(codes.indexOf(34)); // 0
        System.out.println(codes.indexOf(123)); // -1 -> няма такъв елемент в списъка

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(4, 12, 3, 9, 34, 23, 7, 56));

        //сортиране в нарастващ ред (ascending order) -> от най-малкото число до най-голямото число
        Collections.sort(numbers1);

        //сортиране в намаляващ ред (descending order) -> от най-голямото число до най-малкото
        Collections.sort(numbers1);
        Collections.reverse(numbers1);

        List<Double> gradesMath = new ArrayList<>(Arrays.asList(4.20, 5.80, 3.40, 6.00, 4.50));
        List<Double> gradesPhysics = new ArrayList<>(Arrays.asList(3.20, 4.60, 3.90, 5.00, 4.40));

        List<Double> allGrades = new ArrayList<>();
        allGrades.addAll(gradesMath);
        allGrades.addAll(gradesPhysics);

        System.out.println(allGrades.toString());

    }
}
