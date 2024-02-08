package week2MoreExercise;
import java.util.Scanner;
public class RefactoringPrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= N; i++) {
            boolean Prime = true;
            for (int divider = 2; divider < i; divider++) {
                if (i % divider == 0) {
                    Prime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, Prime);


    }

    }
}