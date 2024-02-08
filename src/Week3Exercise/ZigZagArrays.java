package Week3Exercise;
import java.util.Scanner;
public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[N];
        String[] secondArray = new String[N];

        for (int row = 1; row <= N ; row++) {
            String[] currentRowElement = scanner.nextLine().split(" ");
            if (row % 2 != 0){
                firstArray[row - 1] = currentRowElement[0];
                secondArray[row - 1] = currentRowElement[1];
            }
            else {
                firstArray[row - 1] = currentRowElement[1];
                secondArray[row - 1] = currentRowElement[0];
            }
        }
        for (String el1 : firstArray) {
            System.out.print(el1 + " ");
        }
        System.out.println();
        for (String el2 : secondArray) {
            System.out.print(el2 + " ");
        }
    }
}
