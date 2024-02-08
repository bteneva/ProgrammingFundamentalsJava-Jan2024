package Week4MethodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (validLength(inputString) && validOnlyLettersDigits(inputString) && validAtLeastTwoDigits(inputString)) {
            System.out.println("Password is valid");
        } else {
            if (!validLength(inputString)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!validOnlyLettersDigits(inputString)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!validAtLeastTwoDigits(inputString)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    public static boolean validLength(String input) {
        return input.length() >= 6 && input.length() <= 10;
    }

    public static boolean validOnlyLettersDigits(String input) {
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (!((currentChar >= '0' && currentChar <= '9') || (currentChar >= 'a' && currentChar <= 'z'))) {
                return false;
            }
        }

        return true;
    }

    public static boolean validAtLeastTwoDigits(String input) {
        int countDigits = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                countDigits += 1;
            }
        }

        return countDigits >= 2;
    }
}
