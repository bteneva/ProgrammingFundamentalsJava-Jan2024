package week3Arrays;
import java.util.Scanner;
public class PrintNumbersInReverceOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = Integer.parseInt(scanner.nextLine());
        int[] intArray = new int[arrayLength];
        for (int i = 0; i < arrayLength ; i++) {
            intArray[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int j = arrayLength -1; j >=0 ; j--) {
            System.out.print(intArray[j] + " ");

        }
    }
}
