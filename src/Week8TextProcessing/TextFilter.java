package Week8TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banWord : banWords) {
            while (text.indexOf(banWord) !=-1){
                String replacementWord = "";
                for (int i = 0; i < banWord.length(); i++) {
                    replacementWord +="*";
                }
                text = text.replace(banWord, replacementWord);
            }
        }
        System.out.println(text);
    }
}
