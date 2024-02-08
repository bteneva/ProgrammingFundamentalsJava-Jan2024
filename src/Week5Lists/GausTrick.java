package Week5Lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GausTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] gausArray = new int[intList.size()/2];
        for (int i = 0; i < intList.size() / 2; i++) {

            int sum = intList.get(i) + intList.get(intList.size() - 1 - i);
            gausArray[i]= sum;
        }

        for (int i : gausArray) {
            System.out.print(i + " ");
        }
        if (intList.size() % 2 !=0){
            System.out.print(intList.get(intList.size()/2));
        }

    }
}
