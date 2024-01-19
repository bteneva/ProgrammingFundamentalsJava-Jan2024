import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int maxNumber = firstNumber;
        if (secondNumber > maxNumber){
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber){
            maxNumber = thirdNumber;
        }
        System.out.println(maxNumber);
        if (secondNumber > firstNumber){
            System.out.println(secondNumber);
            System.out.println(firstNumber);
        }
        else {
            System.out.println(firstNumber);
            System.out.println(secondNumber);
        }

    }
}
