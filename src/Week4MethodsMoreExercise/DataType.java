package Week4MethodsMoreExercise;
import java.util.Scanner;
public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int input = Integer.parseInt(scanner.nextLine());
                typeAndPrintMethod(input);
                break;
            case "real":
                double doubleInput = Double.parseDouble(scanner.nextLine());
                typeAndPrintMethod(doubleInput);
                break;
            case "string":
                String stringInput = scanner.nextLine();
                typeAndPrintMethod(stringInput);
                break;
            default:
                System.out.println("no data type");
        }

    }
    public static void typeAndPrintMethod(int input){
        int result = input * 2;
        System.out.println(result);
    }
    public static void typeAndPrintMethod (double input){
        double result = 1.5 * input;
        System.out.printf("%.2f", result);
    }
    public static void typeAndPrintMethod(String input){
        System.out.printf("$%s$", input);
    }
}
