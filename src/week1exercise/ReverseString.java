import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int stringLength = inputString.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = stringLength-1; i >=0; i--) {
            reversed.append(inputString.charAt(i));
        }
        System.out.println(reversed.toString());
    }
}
