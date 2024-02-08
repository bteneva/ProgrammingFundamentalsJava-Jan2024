package Week4MethodsExercises;
import java.util.Scanner;
public class volwelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        int counter = vowelCount(inputString);
        System.out.println(counter);

    }

    public static int vowelCount(String inputString) {
        int counter = 0;
        for (int i = 0; i <= inputString.length()-1 ; i++) {

            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'i' || currentChar == 'e' || currentChar == 'u' || currentChar == 'o' || currentChar == 'y'){
                counter += 1;
            }
        }
        return counter;
    }
}
