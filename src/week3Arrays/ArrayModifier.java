package week3Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] initialArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] input = scanner.nextLine().split(" ");
        String command = input[0];
        while (!command.equals("end")){


            if (command.equals("swap")){
                int index1 = Integer.parseInt(input[1]);
                int index2 = Integer.parseInt(input[2]);
                int temp = initialArray[index1];
                initialArray[index1] = initialArray[index2];
                initialArray[index2] = temp;
            }
            else if (command.equals("multiply")){
                int index1 = Integer.parseInt(input[1]);
                int index2 = Integer.parseInt(input[2]);
                int result = initialArray[index1] * initialArray[index2];
                initialArray[index1] = result;
            }
            else if (command.equals("decrease")) {
                for (int i = 0; i < initialArray.length; i++) {
                    initialArray[i] = initialArray[i] - 1;
                }
            }
            input = scanner.nextLine().split(" ");
            command = input[0];

        }
        for (int i = 0; i < initialArray.length; i++) {
            if (i<initialArray.length-1) {
                System.out.print(initialArray[i] + ", ");
            }
            else {
                System.out.print(initialArray[i]);
        }

        }
    }
}
