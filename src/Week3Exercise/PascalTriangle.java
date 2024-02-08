package Week3Exercise;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] row = {1};

        for (int i = 0; i < n; i++) {
            int[] nextRow = new int[i + 2];

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    nextRow[j] = 1;
                } else {
                    nextRow[j] = row[j - 1] + row[j];
                }
            }

            for (int j = 0; j < nextRow.length-1 ; j++) {
                System.out.print(nextRow[j] + " ");
            }
            System.out.println();

            row = nextRow;
        }
    }
}
