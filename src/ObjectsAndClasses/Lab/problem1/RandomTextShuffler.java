package ObjectsAndClasses.Lab.problem1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomTextShuffler {
    private String[] words;

    public RandomTextShuffler(String inputText) {
        // Split the input text into an array of words
        this.words = inputText.split(" ");
    }

    public void shuffleAndPrint() {
        // Convert array to list for shuffling
        List<String> wordList = Arrays.asList(words);

        // Shuffle the list randomly
        Collections.shuffle(wordList);

        // Print each shuffled word on a new line
        for (String word : wordList) {
            System.out.println(word);
        }
    }
}