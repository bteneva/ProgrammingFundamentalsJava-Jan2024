package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")){
            String[] commandArr = command.split(" ");
            if (commandArr[0].equals("Urgent")){
                if (!shoppingList.contains(commandArr[1])){
                    shoppingList.add(0,commandArr[1]);
                }
            }
            else if(commandArr[0].equals("Unnecessary")){
                if (shoppingList.contains(commandArr[1])){
                    shoppingList.remove(commandArr[1]);
                }
            }
            else if(commandArr[0].equals("Correct")){
                if (shoppingList.contains(commandArr[1])){
                    int index = shoppingList.indexOf(commandArr[1]);
                    shoppingList.remove(commandArr[1]);
                    shoppingList.add(index, commandArr[2]);
                }
            }
            else if (commandArr[0].equals("Rearrange")){
                if (shoppingList.contains(commandArr[1])){
                    shoppingList.remove(commandArr[1]);
                    shoppingList.add(commandArr[1]);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}

