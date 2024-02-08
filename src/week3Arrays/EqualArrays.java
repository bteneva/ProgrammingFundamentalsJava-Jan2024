package week3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int firstDifferenceIndex = -1;


        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] != numbers2[i]) {
                firstDifferenceIndex = i;
                break;
            } else {
                sum += numbers1[i];
            }
        }

        if (firstDifferenceIndex == -1) {
            if (numbers1.length == numbers2.length){
                System.out.printf("Arrays are identical. Sum: %d", sum);}
            else {
                System.out.printf("Arrays are not identical. Found difference in length");
            }

        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", firstDifferenceIndex);
        }
    }
}
