import java.util.Scanner;
import java.math.BigDecimal;

public class ExactSumRealNumbers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = BigDecimal.ZERO; // Initialize sum

        for (int i = 0; i < numbersCount; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);
        }

        System.out.println(sum);
    }
}
