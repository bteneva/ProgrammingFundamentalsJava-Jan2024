package Week3Exercise;
import java.util.Scanner;
public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        for (String element2 : array2) {
            for (String element1 : array1) {
                if (element1.equals(element2)){
                    System.out.print(element1 + " ");
                }

            }

        }
    }
}
