package Week5Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream((scanner.nextLine()).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] input = command.split(" ");
            String operation = input[0];
            int number = Integer.parseInt(input[1]);
            switch (operation){
                case "Add":
                    intList.add(number);
                    break;
                case "Remove":
                     intList.remove(Integer.valueOf(number));
                     break;
                case "RemoveAt":
                    intList.remove(number);
                    break;
                case "Insert":
                    int indexForInsert = Integer.parseInt(input[2]);
                    intList.add(indexForInsert, number);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Integer i : intList) {
            System.out.print(i + " ");
        }
    }
}
