package Week5ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandArray = input.split(" ");
            String command = commandArray[0];
            int number = 0;
            int index = 0;
            switch (command) {
                case "Add":
                    number = Integer.parseInt(commandArray[1]);
                    numbers.add(number);
                    break;
                case "Insert":
                    number = Integer.parseInt(commandArray[1]);
                    index = Integer.parseInt(commandArray[2]);
                    if(index > numbers.size()){
                        System.out.println("Invalid index");
                    }
                    else {
                        numbers.add(index, number);
                        }
                    break;
                case "Remove":
                    index = Integer.parseInt(commandArray[1]);
                    numbers.remove(index);

                    break;
                case "Shift":
                    int count = Integer.parseInt(commandArray[2]);
                    if (commandArray[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else if (commandArray[1].equals("right")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }

                    }
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
