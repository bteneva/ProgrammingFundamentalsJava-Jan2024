package Week4MethodsMoreExercise;
import java.util.Scanner;
public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        printMultiplicationSign(num1,num2, num3);
    }
    public static void printMultiplicationSign(int n1, int n2, int n3){
        if ((n1 > 0) && (n2 > 0) && (n3 > 0)){ //
            System.out.printf("positive");
        }
        else if ((n1 < 0) && (n2 < 0) && (n3 < 0)){
            System.out.printf("negative");
        }
        else if ((n1 > 0) && (n2 < 0) && (n3 < 0)){ //
            System.out.printf("positive");
        }
        else if ((n1 < 0) && (n2 > 0) && (n3 > 0)){ //
            System.out.printf("negative");
        }
        else if ((n1 > 0) && (n2 < 0) && (n3 > 0)){ //
            System.out.printf("negative");
        }
        else if ((n1 > 0) && (n2 > 0) && (n3 < 0)){ //
            System.out.printf("negative");
        }
        else if ((n1 < 0) && (n2 < 0) && (n3 > 0)){ //
            System.out.printf("positive");
        }
        else if ((n1 < 0) && (n2 > 0) && (n3 < 0)){ //
            System.out.printf("positive");
        }

    }
}
