package ExamPrep1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int coolTressHold = 1;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)){
                coolTressHold *= Integer.parseInt(String.valueOf(ch));
            }
        }
        String regex = "(?<s>\\:\\:|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\k<s>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> validEmojies = new ArrayList<>();
        List<String> coolEmojies = new ArrayList<>();
        while (matcher.find()){
            validEmojies.add(matcher.group());
        }
        for (String validEmojy : validEmojies) {
            int letterSum = 0;
            for (int i = 0; i < validEmojy.length(); i++) {
                if (Character.isLetter(validEmojy.charAt(i))){
                    letterSum += (int) validEmojy.charAt(i);

                }
            }
            if (letterSum >= coolTressHold) {
                coolEmojies.add(validEmojy);
            }

        }
        System.out.println("Cool threshold: "+ coolTressHold);
        System.out.printf("%d emojis found in the text. The cool ones are: ", validEmojies.size());
        for (String coolEmojy : coolEmojies) {
            System.out.printf("%n%s",coolEmojy);
        }

    }
}
