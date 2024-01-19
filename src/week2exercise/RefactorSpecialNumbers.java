import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;
        int number = 0;
        boolean specialOrNot = false;
        for (int ch = 1; ch <= numberCount; ch++) {
            number = ch;
            while (ch > 0) {
                sumDigits += ch % 10;
                ch = ch / 10;
            } specialOrNot = (sumDigits == 5) || (sumDigits == 7) || (sumDigits == 11);
            System.out.printf("%d -> %b%n", number, specialOrNot);
            sumDigits = 0; ch = number;
        }
    }
}
