package Week8TextProcessing;

import java.util.Scanner;

public class CaesarCifer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            ch +=3;
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
