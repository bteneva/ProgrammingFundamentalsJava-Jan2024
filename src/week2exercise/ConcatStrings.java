import java.util.Scanner;

public class ConcatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();
        System.out.printf("%s%s%s", input1, input3, input2);
    }
}
