package week2MoreExercise;
import java.util.Scanner;

public class DecryptedMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int linesThatFolow = Integer.parseInt(scanner.nextLine());
        String decryptedWord ="";
        for (int i = 0; i < linesThatFolow; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            char decryptedChar = (char) (currentChar + key);
            decryptedWord +=decryptedChar;
        }
        System.out.println(decryptedWord);
    }
}
