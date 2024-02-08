package Week3Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfRotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberOfRotations; i++) {
            int s = intArray[0];
            for (int j = 0; j <= intArray.length-2 ; j++) {
                intArray[j] = intArray[j+1];

            }
            intArray[intArray.length-1] = s;
        }
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
