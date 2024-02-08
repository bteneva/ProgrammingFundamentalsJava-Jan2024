package week4Methods;
import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int numberOfRepetitions = Integer.parseInt(scanner.nextLine());
        String repeatedString = repeatString(inputString, numberOfRepetitions);
        System.out.println(repeatedString);
    }
    public static String repeatString(String input, int repetitions) {
        String repeatedString = "";
        for (int i = 0; i < repetitions; i++) {
            repeatedString += input;
        }
        return repeatedString;

    }
}
