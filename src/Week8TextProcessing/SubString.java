package Week8TextProcessing;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        while (input2.indexOf(input1) != -1) {

            input2 = input2.replace(input1, "");

        }
        System.out.println(input2);
    }
}
