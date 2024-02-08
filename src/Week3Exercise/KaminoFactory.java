package Week3Exercise;
import java.util.Scanner;

public class KaminoFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seqLength = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        String[] SeqArray = new String[command.length()];
        while (!command.equals("Clone them!")){

            String[] stringArr = command.split("!");
            for (int i = 0; i < seqLength; i++) {
                SeqArray[i] = stringArr[i];
            }

            command = scanner.nextLine();

        }
            for(String i : SeqArray) {
                System.out.print(i + " ");
            }
    }
}
