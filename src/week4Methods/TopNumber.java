package week4Methods;
import java.util.Scanner;
public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (topNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean topNumber(int number){
        int sumDigits = 0;
        boolean hasOddDigit = false;
        while (number > 0){
            int n = number % 10;
            sumDigits +=n;
            if (n % 2 != 0){
                hasOddDigit = true;
            }
            number = number / 10;
        }
        if ((sumDigits % 8 == 0) && hasOddDigit){
            return true;
        }
        else return false;
    }
}
