package Week5ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int wagonCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] commandArray = command.split(" ");
            if (commandArray[0].equals("Add")){
                int newWagon = Integer.parseInt(commandArray[1]);
                wagons.add(newWagon);
            }
            else {
                int newPeopleInTheWagonCount = Integer.parseInt(commandArray[0]);
                for (int position = 0; position < wagons.size()-1; position++) {
                    //int freeSeatsinWagon = wagonCapacity - wagons.get(position);
                    int wagon = wagons.get(position);
                    if (wagon + newPeopleInTheWagonCount <= wagonCapacity){
                        wagons.set(position, newPeopleInTheWagonCount + wagon);
                        break;
                    }
                }
            }
            command = scanner.nextLine();

        }
        System.out.println(wagons.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
