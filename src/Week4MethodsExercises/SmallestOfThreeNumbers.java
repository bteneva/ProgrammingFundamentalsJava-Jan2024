package Week4MethodsExercises;
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());
        int smallestOfThree = smallestOfThree(numberOne, numberTwo, numberThree);
        System.out.println(smallestOfThree);

    }
    public static int smallestOfThree(int n1, int n2, int n3){
        if ((n1 <= n2) && (n1 <= n3)){
            return n1;
        }
        else if ((n2 <= n1) && (n2 <= n3)){
            return n2;
        }
        else {
            return n3;
        }
    }
}
