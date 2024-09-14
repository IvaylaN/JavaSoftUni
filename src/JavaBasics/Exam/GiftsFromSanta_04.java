package JavaBasics.Exam;

import java.util.Scanner;

public class GiftsFromSanta_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int S = Integer.parseInt(scanner.nextLine());


        if (N < 0 || N >= M || M > 10000 || S < N || S > M) {
            System.out.println("Invalid input.");
            return;
        }

        for (int address = M; address >= N; address--) {
            if (address % 2 == 0 && address % 3 == 0) {
                if (address == S) {
                    break;
                }
                System.out.print(address + " ");
            }
        }
    }
}
