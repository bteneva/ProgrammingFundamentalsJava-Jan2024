import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal numberA = new BigDecimal(scanner.nextLine());
        BigDecimal numberB = new BigDecimal(scanner.nextLine());
        double eps = 0.000001F;

        if (numberA.subtract(numberB).abs().compareTo(BigDecimal.valueOf(eps)) < 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
