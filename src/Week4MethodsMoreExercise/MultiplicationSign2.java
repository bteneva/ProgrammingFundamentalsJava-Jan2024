package Week4MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        signCheck(num1, num2, num3);
    }

    private static void signCheck(int num1, int num2, int num3) {
        int counterNegatives = 0;
        if (num1 < 0) {
            counterNegatives++;
        }
        if (num2 < 0) {
            counterNegatives++;
        }
        if (num3 < 0) {
            counterNegatives++;
        }
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if (counterNegatives == 2 || counterNegatives == 0) {
            System.out.println("positive");
        } else {
            System.out.printf("negative");
        }


    }
}