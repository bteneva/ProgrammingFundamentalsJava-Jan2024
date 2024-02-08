package week4Methods;
import java.util.Scanner;
public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        System.out.println(middleCharacters(inputString));

    }
    public static String middleCharacters (String input){
        int length = input.length();

        if (length % 2 == 0 && length >= 2) {

            return input.substring(length / 2 - 1, length / 2 + 1);
        } else if (length % 2 != 0 && length >= 1) {

            return Character.toString(input.charAt(length / 2));
        } else {

            return "Invalid input";
        }
    }
}

