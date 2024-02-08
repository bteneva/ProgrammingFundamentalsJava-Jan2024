package week2exercise;
import java.util.Scanner;
public class printPartOfASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        for (int i = firstNum; i <= secondNum ; i++) {
            char ch = (char)i;
            System.out.print(ch + " ");

        }
    }
}
