package MidExamPreparation;

import java.util.Scanner;

public class TheBlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double plunderAmount = 0;
        for (int day = 1; day <= days; day++) {
            plunderAmount +=dailyPlunder;
            if (day % 3 == 0){
                plunderAmount += dailyPlunder * 0.5;
            }
            if (day % 5 == 0){
                plunderAmount *=0.7;
            }
        }
        if (plunderAmount >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", plunderAmount);
        }
        else {
            System.out.printf("Collected only %.2f%% of the plunder.", (plunderAmount/expectedPlunder)*100);
        }
    }
}
