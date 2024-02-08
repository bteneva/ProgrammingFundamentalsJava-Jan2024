package Week4MethodsExercises;
import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        extractChar(firstChar, secondChar);
    }

    private static void extractChar(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (int i = firstChar + 1; i < secondChar; i++) {
                System.out.print((char) i + " ");
            }
        }
        else if ( firstChar > secondChar){
            for (int i = secondChar + 1; i < firstChar; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
