package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArray = command.split("\\s+");
            String action = commandArray[0];
            int index = Integer.parseInt(commandArray[1]);

            switch (action) {
                case "Shoot":
                    int power = Integer.parseInt(commandArray[2]);
                    if (index >= 0 && index < integerList.size()) {
                        int element = integerList.get(index) - power;
                        if (element > 0) {
                            integerList.set(index, element);
                        } else {
                            integerList.remove(index);
                        }
                    }
                    break;

                case "Add":
                    int value = Integer.parseInt(commandArray[2]);
                    if (index >= 0 && index < integerList.size()) {
                        integerList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    int radius = Integer.parseInt(commandArray[2]);
                    int startIndex = index - radius;
                    int endIndex = index + radius;

                    if (startIndex >= 0 && endIndex < integerList.size()) {
                        integerList.subList(startIndex, endIndex + 1).clear();
                    }
                    else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(integerList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("|")));
    }
}
