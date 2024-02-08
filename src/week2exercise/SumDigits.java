package week2exercise;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean hasDigits = true;
        int sumOfDigits =0;
        while (hasDigits){
            int digit = number % 10;
            number = number / 10;
            if (number == 0){
                hasDigits = false;
            }
            sumOfDigits +=digit;
        }
        System.out.println(sumOfDigits);
    }
}
