package week2exercise;
import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 97; i < 97+n; i++) {
            char ch = (char)i;
            for (int j = 97; j < 97+n ; j++) {
                char ch1 = (char)j;
                for (int m= 97; m < 97+n; m++) {
                    char ch2 = (char)m;
                    System.out.print(ch);
                    System.out.print(ch1);
                    System.out.print(ch2);
                    System.out.println();

                }
            }

        }
    }
}
