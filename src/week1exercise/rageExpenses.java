import java.util.Scanner;
import java.math.MathContext;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //calculations
        int headsetCrashesCount = lostGamesCount / 2;
        int mouseCrashesCount = lostGamesCount / 3;
        int keyboardCrashesCount = lostGamesCount / 6;
        int displayCrashesCount = lostGamesCount / 12;

        double rageExpenses = headsetCrashesCount * headsetPrice +
                mouseCrashesCount * mousePrice +
                keyboardCrashesCount * keyboardPrice +
                displayCrashesCount * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
