package Week4MethodsMoreExercise;
import java.util.Scanner;
public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printTribonacciSeq(num);
        }
        public static void printTribonacciSeq(int n){
        int[] tribonacci = new int[n];
        if (n >=3) {
            tribonacci[0] = 1;
            tribonacci[1] = 1;
            tribonacci[2] = 2;

            for (int i = 3; i < n; i++) {
                tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
            }
        }
        else if(n == 1)
        {
            tribonacci[0] = 1;
        }
        else if(n == 2)
        {
            tribonacci[0] = 1;
            tribonacci[0] = 1;
            tribonacci[1] = 1;
        }


            for (int num : tribonacci) {
                System.out.print(num + " ");
            }

    }
}
