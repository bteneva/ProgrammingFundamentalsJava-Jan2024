package Week5ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] commandArray = command.split(" ");
            if (commandArray[0].contains("Delete")) {
                int number = Integer.parseInt(commandArray[1]);
                for (int i = 0; i < intList.size(); i++) {
                    if (intList.get(i).equals(number)) {
                        intList.remove(i);
                        i--;
                    }
                }
            }
            else if(commandArray[0].contains("Insert")){
                int element = Integer.parseInt(commandArray[1]);
                int position = Integer.parseInt(commandArray[2]);
                intList.add(position, element);
            }
            command = scanner.nextLine();
        }
        System.out.println(intList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
