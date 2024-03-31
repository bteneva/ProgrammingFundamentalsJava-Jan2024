import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String input1 = input[0];
        String input2 = input[1];
        String min = "";
        int sum = 0;

        if (input1.length() <= input2.length()) {
            min = input1;
        } else {
            min = input2;
        }

        for (int i = 0; i < min.length(); i++) {
            char char1 = input1.charAt(i);
            char char2 = input2.charAt(i);
            int product = char1 * char2;
            sum += product;
        }

        if (input1.length() > input2.length()) {
            for (int i = min.length(); i < input1.length(); i++) {
                char ch = input1.charAt(i);
                sum += ch;
            }
        } else if (input1.length() < input2.length()) {
            for (int i = min.length(); i < input2.length(); i++) {
                char ch = input2.charAt(i);
                sum += ch;
            }
        }

        System.out.println(sum);
    }
}
