package ExamPrep_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> targets  = Arrays.stream(scanner.nextLine().split(" "))
                                  .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        int countShotTarget = 0;

        while(!command.equals("End")){
            int shotSpot = Integer.parseInt(command);

            if (shotSpot >= 0 && shotSpot < targets.size()) {
                int valueShotTarget = targets.get(shotSpot);

                for (int i = 0; i < targets.size(); i++) {
                    int currentTargetValue = targets.get(i);
                    if(currentTargetValue != -1 && currentTargetValue != valueShotTarget){
                        if(currentTargetValue > valueShotTarget){
                            targets.set(i, currentTargetValue - valueShotTarget);
                        } else {
                            targets.set(i, currentTargetValue + valueShotTarget);
                        }
                    }
                }

                targets.set(shotSpot, -1);
                countShotTarget++;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", countShotTarget);
        for (int target : targets) {
            System.out.print(target + " ");
        }



    }
}
