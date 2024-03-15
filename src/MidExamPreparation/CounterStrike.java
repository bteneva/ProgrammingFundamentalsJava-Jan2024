package MidExamPreparation;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int battlesWon = 0;
        while (!command.equals("End of battle")){
            int distanceOfAnEnemy = Integer.parseInt(command);
            if (energy - distanceOfAnEnemy >= 0){
                battlesWon++;
                energy -= distanceOfAnEnemy;
                if (battlesWon % 3 == 0){
                    energy += battlesWon;
                }
            }
            else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battlesWon, energy);
                return;
            }
            command = scanner.nextLine();

        }
        System.out.printf("Won battles: %d. Energy left: %d", battlesWon, energy);
    }
}
