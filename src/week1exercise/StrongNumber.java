import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum =0;
        int originalNumber = number;

        while (number != 0){
            int digit = number % 10;
            number = number / 10;
            int factorial = 1;
            for (int i = 1; i <=digit ; i++) {
                factorial = i* factorial;
            }
            sum += factorial;

        }
        if (sum == originalNumber){
            System.out.printf("yes");
        }
        else System.out.printf("no");


    }
}
