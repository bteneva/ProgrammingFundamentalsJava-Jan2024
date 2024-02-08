package Week3Exercise;
import java.util.Scanner;
import java.util.Arrays;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] resultIntArray = new int[n];

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            int[] intArray = new int[word.length()];
            int sum = 0;


            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                int currentIntArrayElement = (int)(currentChar);

                if (currentIntArrayElement == 65 || currentChar == 69 || currentChar == 73
                        || currentChar == 79 || currentChar == 85
                        || currentChar == 97 || currentChar == 101 || currentChar == 105
                        || currentChar == 111 || currentChar == 117 ) {
                    //|| currentChar == 121; || currentChar == 89)
                    currentIntArrayElement *= word.length();
                } else {
                    currentIntArrayElement /= word.length();
                }
                sum += currentIntArrayElement;

            }

            resultIntArray[i] += sum;
        }

        Arrays.sort(resultIntArray);
        for (int element : resultIntArray) {
            System.out.println(element);
        }
    }
}
