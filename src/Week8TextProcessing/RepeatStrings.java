package Week8TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArr = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : stringArr) {
            for (int i = 0; i < s.length(); i++) {
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
    }
}
