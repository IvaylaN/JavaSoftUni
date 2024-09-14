package JavaBasics.Lesson04;

public class Ex01NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int i = 7; i <= 997; i++) { // може и i+=10, защото през 10 се делят на 7, и няма да имаме if проверка
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
