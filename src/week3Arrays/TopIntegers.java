package week3Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < intArray.length; i++) {
            boolean topInt = true;
            for (int j = i + 1; j <= intArray.length-1; j++) {
                if (intArray[i] <= intArray[j]){
                    topInt = false;
                    break;
                }

            }
            if (topInt){
                System.out.print(intArray[i] + " ");
            }
        }
    }
}
