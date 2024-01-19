import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ch3).append(" ").append(ch2).append(" ").append(ch1);
        String result = stringBuilder.toString();
        System.out.print(result);
    }
}
