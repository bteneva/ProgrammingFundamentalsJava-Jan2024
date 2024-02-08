package week2exercise;
import java.util.Scanner;
public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int extractedSpicesTotal = 0;
        int daysOperated = 0;
        int dayYield = startingYield;
        int spicesEaten = 26;

        while (dayYield >=100){
            extractedSpicesTotal += dayYield - spicesEaten;
            dayYield -=10;
            daysOperated +=1;
        }
        extractedSpicesTotal -=spicesEaten;
        System.out.println(daysOperated);
        System.out.println(extractedSpicesTotal);


    }
}
