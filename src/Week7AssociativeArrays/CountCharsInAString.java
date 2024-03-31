import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> charCount = new LinkedHashMap<>();  // Use LinkedHashMap

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String s = Character.toString(ch);
            if (!s.equals(" ")) {
                if (!charCount.containsKey(s)) {
                    charCount.put(s, 1);
                } else {
                    charCount.put(s, charCount.get(s) + 1);
                }
            }
        }

        charCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
