import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.nextLine().charAt(0);
        if (Character.isUpperCase(char1)){
            System.out.println("upper-case");
        }
        else System.out.println("lower-case");
    }
}
