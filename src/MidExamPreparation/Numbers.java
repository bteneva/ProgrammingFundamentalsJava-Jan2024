package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;


public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        for (Integer i : integerList) {
            sum +=i;
        }
        double averageSum = sum*1.0 / integerList.size();
        Collections.sort(integerList);
        Collections.reverse(integerList);
        List<Integer> aboveAverageList = new ArrayList<>();
        for (Integer i : integerList) {
            if (i > averageSum){
                aboveAverageList.add(i);
            }
        }
        if (aboveAverageList.isEmpty()){
            System.out.println("No");
        }
        else {
            if (aboveAverageList.size() >= 5) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(aboveAverageList.get(i) + " ");
                }
            }
            else {
                for (Integer i : aboveAverageList) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
