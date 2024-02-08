package Week5Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> intList2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();
        int iterations = 0;
        int finalIterations =0;
        if (intList1.size() < intList2.size()){
            iterations = intList1.size();
            finalIterations = intList2.size() - intList1.size() ;
            merging(iterations, mergedList, intList1, intList2);
            for (int i = intList1.size(); i < intList2.size(); i++) {
                mergedList.add(intList2.get(i));
            }

        }
        else {
            iterations = intList2.size();
            finalIterations = intList1.size() - intList2.size() ;
            merging(iterations, mergedList, intList1, intList2);
            for (int i = intList2.size(); i < intList1.size(); i++) {
                mergedList.add(intList1.get(i));
            }
        }

        System.out.println(mergedList.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }



    private static void merging(int iterations, List<Integer> mergedList, List<Integer> intList1, List<Integer> intList2) {
        for (int i = 0; i < iterations; i++) {
            mergedList.add(intList1.get(i));
            mergedList.add(intList2.get(i));
        }
    }

}
