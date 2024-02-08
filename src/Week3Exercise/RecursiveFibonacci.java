package Week3Exercise;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] intArray = new int[n + 1];
        intArray[0] = 1;
        intArray[1] = 1;

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                intArray[i] = intArray[i - 1] + intArray[i - 2];
            }
            System.out.println(intArray[n-1]);
        } else {
            System.out.println(1);
        }
    }
}
