package week2exercise;
import java.util.Scanner;

public class sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char character = scanner.nextLine().charAt(0);
            sum +=(int)character;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
