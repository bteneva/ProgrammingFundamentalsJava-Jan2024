package ExamPrep1;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String instruction = scanner.nextLine();
        while (!instruction.equals("Decode")){
            String command = instruction.split("\\|")[0];
            switch (command){
                case "Move":
                    int numberOfLettersToMove = Integer.parseInt(instruction.split("\\|")[1]);
                    //move the first numberOfLettersToMove to the back of the string
                    String stringToMove = encryptedMessage.substring(0, numberOfLettersToMove);
                    encryptedMessage = encryptedMessage.substring(numberOfLettersToMove) + stringToMove;
                    break;

                case "Insert":
                    int index =  Integer.parseInt(instruction.split("\\|")[1]);
                    String value = instruction.split("\\|")[2];
                    //Inserts the given value before the given index in the string
                    StringBuilder sb = new StringBuilder(encryptedMessage);
                    sb.insert(index, value);
                    encryptedMessage = sb.toString();

                    break;
                case "ChangeAll":
                    String substring = instruction.split("\\|")[1];
                    String replacementString = instruction.split("\\|")[2];
                    //Changes all occurrences of the given substring with the replacement text
                    encryptedMessage = encryptedMessage.replaceAll(substring, replacementString);
                    break;

            }
            instruction = scanner.nextLine();

        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
