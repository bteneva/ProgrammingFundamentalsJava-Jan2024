package week3Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        while (intArray.length > 1) {
            int[] condensedArray = new int[intArray.length - 1];

            for (int i = 0; i < intArray.length - 1; i++) {
                condensedArray[i] = intArray[i] + intArray[i + 1];
            }

            intArray = condensedArray;
        }

        System.out.println(intArray[0]);
    }
}