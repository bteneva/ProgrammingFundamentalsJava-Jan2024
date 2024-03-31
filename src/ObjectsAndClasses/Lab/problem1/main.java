package ObjectsAndClasses.Lab.problem1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input text
        String inputText = scanner.nextLine();

        // Create an instance of RandomTextShuffler
        RandomTextShuffler shuffler = new RandomTextShuffler(inputText);

        // Shuffle and print the words
        shuffler.shuffleAndPrint();
    }
}