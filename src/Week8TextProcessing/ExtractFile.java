package Week8TextProcessing;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\\\");
        String lastElement = inputArr[inputArr.length-1];
        String[] elements = lastElement.split("\\.");
        System.out.printf("File name: %s%n", elements[0]);
        System.out.printf("File extension: %s", elements[1]);
    }
}
