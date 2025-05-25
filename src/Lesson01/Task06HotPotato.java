package Lesson01;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Task06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, names);

        int n = Integer.parseInt(scanner.nextLine());
        int rotations = 0;
        while(queue.size()>1) {
            String firstKid = queue.poll();
            rotations++;
            if (rotations % n == 0) {
                System.out.println("Removed " + firstKid);
            } else {
                queue.offer(firstKid);
            }
        }
        System.out.println("Last is " + queue.poll());


    }
}