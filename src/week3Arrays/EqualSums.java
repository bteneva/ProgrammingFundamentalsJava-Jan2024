package week3Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean numberExist = false;
        int index = 0;
        for (int i = 0; i < intArray.length ; i++) {
            int leftSum = 0;
            int rightSum =0;
            for (int j = 0; j < i ; j++) {
                leftSum += intArray[j];
            }
            for (int j = i+1; j < intArray.length ; j++) {
                rightSum += intArray[j];
            }
            if (leftSum == rightSum){
                numberExist = true;
                index = i;
                break;
            }

        }
        if (numberExist){
            System.out.println(index);
        }
        else {
            System.out.println("no");
        }
    }
}
