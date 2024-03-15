package Week5ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> partyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String > command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            if (!command.contains("not")){
                if (partyList.contains(command.get(0))){
                    System.out.printf("%s is already in the list!%n", command.get(0));
                }
                else {
                    partyList.add(command.get(0));
                    //System.out.printf("%s is going!", command.get(0));
                }
            }
            else{
                if (partyList.contains(command.get(0))){
                    //System.out.printf("%s is not going!", command.get(0));
                    partyList.remove(command.get(0));
                }
                else if (!partyList.contains(command.get(0)))
                System.out.printf("%s is not in the list!%n", command.get(0));
            }
        }

        for (String s : partyList) {
            System.out.println(s);
        }
    }
}
