package Week5Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> positiveList = new ArrayList<>();
        for (Integer i : intList) {
            if (i >= 0){
                positiveList.add(i);
            }
        }
        Collections.reverse(positiveList);
        if (positiveList.isEmpty()){
            System.out.println("empty");
        }
        else{
            System.out.println(positiveList.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
