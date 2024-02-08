package week3Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < intArray.length -1; i++) {
            for (int j = i; j < intArray.length ; j++) {
                if (number == (intArray[i] + intArray[j])){
                    System.out.println(intArray[i] + " " + intArray[j]);
                }
            }

        }
    }
}
