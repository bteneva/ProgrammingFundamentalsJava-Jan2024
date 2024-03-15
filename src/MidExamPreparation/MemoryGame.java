package MidExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int numberOfMoves = 0;
        boolean foundAllElements = (inputList.size() == 0);
        while (!command.equals("end")){
            numberOfMoves ++;
            String[] inputIndex = command.split(" ");
            int index1 = Integer.parseInt(inputIndex[0]);
            int index2 = Integer.parseInt(inputIndex[1]);
            if (index1 < 0 || index2 < 0 || index1==index2 || index1 > inputList.size()-1 || index2 > inputList.size()-1){
                System.out.println("Invalid input! Adding additional elements to the board");
                String newElement = "-" +numberOfMoves + "a";
                inputList.add(inputList.size() / 2, newElement);
                inputList.add(inputList.size() / 2, newElement);


            }
            else if (inputList.get(index1).equals(inputList.get(index2))){

                System.out.printf("Congrats! You have found matching elements - %s!\n", inputList.get(index1));
                inputList.remove(index1);
                inputList.remove(index2);
                if (foundAllElements) {
                    System.out.printf("You have won in %d turns!", numberOfMoves);
                }
            }
            else {
                System.out.println("Try again!");
            }
            command = scanner.nextLine();
        }
        if (!foundAllElements){
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", inputList));

        }
    }
}
