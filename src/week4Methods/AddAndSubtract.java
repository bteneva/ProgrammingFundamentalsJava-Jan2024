package week4Methods;
import java.util.Scanner;
public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int result = subtractInt(sumInt(firstNumber, secondNumber), thirdNumber);
        System.out.println(result);
    }
    public static int sumInt(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int subtractInt (int sumInt, int thirdNumber){
        return sumInt - thirdNumber;
    }
}
