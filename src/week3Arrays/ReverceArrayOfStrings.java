package week3Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ReverceArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");

        for (int i = stringArray.length -1; i >=0 ; i--) {
            System.out.print(stringArray[i] + " ");
        }

    }
}
