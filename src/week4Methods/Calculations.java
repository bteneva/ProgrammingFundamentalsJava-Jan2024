package week4Methods;
import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {    //"add", "multiply", "subtract", "divide
            case "add":
                addNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                subtrackNumbers(firstNumber,secondNumber);
                break;
            case "divide":
                divideNumbers(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid command");
                break;
        }

    }
    public static void addNumbers (int firstN, int secondN){
        System.out.println(firstN + secondN);
    }
    public static void multiplyNumbers (int firstN, int secondN){
        System.out.println(firstN * secondN);
    }
    public static void subtrackNumbers (int firstN, int secondN){
        System.out.println(firstN - secondN);
    }
    public static void divideNumbers (int firstN, int secondN){
        System.out.println(firstN / secondN);
    }

}
