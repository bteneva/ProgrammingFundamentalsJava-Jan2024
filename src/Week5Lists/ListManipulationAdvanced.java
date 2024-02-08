package Week5Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] arrayString = command.split(" ");
            if (arrayString[0].equals("Contains")) {
                int number = Integer.parseInt(arrayString[1]);
                if (intList.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (arrayString[0].equals("Print")) {
                String evenOrOdd = arrayString[1];
                if (evenOrOdd.equals("even")) {
                    List<Integer> evenList = new ArrayList<>();
                    for (Integer i : intList) {
                        if (i % 2 == 0) {
                            evenList.add(i);
                        }
                    }
                    System.out.println(evenList.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(" ")));
                } else {
                    List<Integer> oddList = new ArrayList<>();
                    for (Integer i : intList) {
                        if (i % 2 != 0) {
                            oddList.add(i);
                        }
                    }
                    System.out.println(oddList.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(" ")));
                }
            }else if(arrayString[0].equals("Get")){
                int sum = 0;
                for (Integer i : intList) {
                    sum += i;
                }
                System.out.println(sum);
            }
            else if(arrayString[0].equals("Filter")){
                String condition = arrayString[1];
                List<Integer> conditionList = new ArrayList<>();
                int number = Integer.parseInt(arrayString[2]);
                switch (condition){
                    case "<":
                        for (Integer i : intList) {
                            if (i < number){
                                conditionList.add(i);
                            }
                        }
                        break;
                    case ">":
                        for (Integer i : intList) {
                            if (i > number){
                                conditionList.add(i);
                            }
                        }
                        break;
                    case ">=":
                        for (Integer i : intList) {
                            if (i >= number){
                                conditionList.add(i);
                            }
                        }
                        break;
                    case "<=":
                        for (Integer i : intList) {
                            if (i <= number){
                                conditionList.add(i);
                            }
                        }
                        break;
                }
                System.out.println(conditionList.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")));
            }


            command = scanner.nextLine();
        }
    }
}
