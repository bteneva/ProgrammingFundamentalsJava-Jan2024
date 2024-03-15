package MidExam;

import java.util.Scanner;

public class Problem1CookingMasterclass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());

        //The educational set for one student consists of 1 package of flour, 10 eggs, and an apron.
        //You should know that the aprons get dirty often, so George should buy 20% more, rounded up to the next integer.
        // Also, every fifth package of flour is free.

        double endExpense = 0;
        for (int i = 1; i <= students; i++) { //calculating price of flour and eggs for all of the students
            endExpense += 1 * priceFlour + 10 * priceEgg;
            if (i % 5 == 0){
                endExpense -= priceFlour;
            }
        }
        //adding aprons:
        endExpense += Math.ceil(students * 1.2) * priceApron;
        double neededMoney = endExpense - budget;
        if (neededMoney > 0 ){
            System.out.printf("%.2f$ more needed.", neededMoney);
        }
        else {
            System.out.printf("Items purchased for %.2f$.", endExpense);
        }
    }
}
