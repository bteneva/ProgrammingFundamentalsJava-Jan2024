import java.util.Scanner;

public class FactorialDivision1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double result = factorialDivision(firstNumber, secondNumber);

        System.out.printf("%.2f", result);
    }

    public static double factorialDivision(int number1, int number2) {

        double result = 1;

        for (int i = number2 +1; i <= number1; i++) {
            result *= i;
        }

        return result;
    }
}
