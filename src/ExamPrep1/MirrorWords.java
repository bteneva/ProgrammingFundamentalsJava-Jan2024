package ExamPrep1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<suf>\\@|\\#)(?<wordA>[A-Za-z]{3,})\\k<suf>{2}(?<wordB>[A-Za-z]{3,})\\k<suf>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Map<String, String> mirrorWords = new LinkedHashMap<>();
        int wordPairs = 0;
        while (matcher.find()){
            wordPairs++;
            String wordA = matcher.group("wordA");
            String wordB = matcher.group("wordB");
            StringBuilder sb = new StringBuilder(wordB);
            if (wordA.equals(sb.reverse().toString())){
                mirrorWords.put(wordA, wordB);
            }
        }
        if (wordPairs>0){
            System.out.printf("%d word pairs found!%n",wordPairs);
            if (mirrorWords.isEmpty()){
                System.out.println("No mirror words!");
            }
            else{
                System.out.println("The mirror words are:");
                StringBuilder outputBuilder = new StringBuilder();
                mirrorWords.forEach((wordA, wordB) -> outputBuilder.append(String.format("%s <=> %s, ", wordA, wordB)));
                String output = outputBuilder.substring(0, outputBuilder.length() - 2); // Remove the last comma and space
                System.out.println(output);
            }
        }
        else{
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }

    }
}
