package ExamPrep1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine(); //"{piece}|{composer}|{key}"
            String[] inputArr = input.split("\\|");
            String piece = inputArr[0];
            String composer = inputArr[1];
            String key = inputArr[2];
            pieceComposer.put(piece, composer);
            pieceKey.put(piece, key);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            String[] commandArray = command.split("\\|");
            String action = commandArray[0];
            String piece = commandArray[1];
            if (action.equals("Add")){
                String composer = commandArray[2];
                String key = commandArray[3];
                if (!pieceComposer.containsKey(piece)){
                    pieceComposer.put(piece, composer);
                    pieceKey.put(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }
                else{
                    System.out.printf("%s is already in the collection!%n", piece);
                }

            }
            else if (action.equals("Remove")){
                if (pieceComposer.containsKey(piece)){
                    pieceKey.remove(piece);
                    pieceComposer.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                }
                else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            }
            else if (action.equals("ChangeKey")){
                String newKey = commandArray[2];
                if (pieceKey.containsKey(piece)){
                    pieceKey.put(piece, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, pieceKey.get(piece));
                }
                else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            }


            command = scanner.nextLine();
        }
        pieceKey.forEach((piece, key) -> System.out.printf("%s -> Composer: %s, Key: %s%n", piece, pieceComposer.get(piece), key));

    }
}
