import java.util.Scanner;


public class PrintAndSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);

    }
}
