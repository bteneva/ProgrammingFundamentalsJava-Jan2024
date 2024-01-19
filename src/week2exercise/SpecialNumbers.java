import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            boolean noDigit = true;
            int sumDigits =0;
            int a = 0;
            while (noDigit){
                a = i % 10;
                sumDigits +=a;
                if (a == 0){
                    noDigit = false;
                }
            }
            if ((sumDigits == 5) || (sumDigits == 7) || (sumDigits == 11)){
                System.out.printf("%d -> True", i);
            }
            else System.out.printf("%d -> False", i);

        }
    }
}
