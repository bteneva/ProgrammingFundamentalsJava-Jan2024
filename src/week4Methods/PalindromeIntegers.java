package week4Methods;
import java.util.Scanner;
public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")){
            System.out.println(palindromeCheck(command));
            command = scanner.nextLine();
        }
    }
    public static boolean palindromeCheck(String input){
        String reversed = new StringBuilder(input).reverse().toString();
        if (reversed.equals(input)){
            return true;
        }
        else return false;
    }
}
