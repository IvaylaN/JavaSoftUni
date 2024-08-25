package ExamFirstTry;

import java.util.Scanner;

public class _03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double score = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine(); //"summer" или "winter"
        String place = scanner.nextLine(); //"Bulgaria" или "Abroad"


        double totalscore = 0;
        double score1 = 0;

        if (place.equals("Bulgaria")) {
            totalscore = score * dancers;
            if (season.equals("summer")) {
                score1 = totalscore * 0.95;
            } else if (season.equals("winter")) {
                score1 = totalscore * 0.92;
            }



        } else if (place.equals("Abroad")) {
            totalscore = score * dancers * 1.5;
            if (season.equals("summer")) {
                score1 = totalscore * 0.90;
            } else if (season.equals("winter")) {
                score1 = totalscore * 0.85;
            }


        }

        double cherity = score1 * 0.75;
        double leftMoney = (score1 - cherity) / dancers;

        System.out.printf("Charity - %.2f%n", cherity);
        System.out.printf("Money per dancer - %.2f", leftMoney);


    }
}


