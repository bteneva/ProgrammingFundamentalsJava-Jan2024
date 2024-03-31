package ExamPrep1;
import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();
        String newPassword = "";

        while (!command.equals("Done")) {
            String[] commandArray = command.split("\\s");
            String action = commandArray[0];

            switch (action) {
                case "TakeOdd":
                    newPassword = takeOddCharacters(input);
                    System.out.println(newPassword);
                    input = newPassword;
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandArray[1]);
                    int length = Integer.parseInt(commandArray[2]);
                    newPassword = cutSubstring(input, index, length);
                    System.out.println(newPassword);
                    input = newPassword;
                    break;
                case "Substitute":
                    String substring = commandArray[1];
                    String substitute = commandArray[2];
                    newPassword = substituteSubstring(input, substring, substitute);
                    input = newPassword;
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", newPassword);
    }

    // Static method to take odd characters from a string
    public static String takeOddCharacters(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 != 0) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    // Static method to cut a substring from a string
    public static String cutSubstring(String input, int index, int length) {
        return input.substring(0, index) + input.substring(index + length);
    }

    // Static method to substitute a substring with another string
    public static String substituteSubstring(String input, String substring, String substitute) {
        if (input.contains(substring)) {
            String newPassword = input.replace(substring, substitute);
            System.out.println(newPassword);
            return newPassword;
        } else {
            System.out.println("Nothing to replace!");
            return input;
        }
    }
}
