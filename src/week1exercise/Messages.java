import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digits = Integer.parseInt(scanner.nextLine());
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < digits; i++) {
            int number = scanner.nextInt();

            // Handle special case for 0
            if (number == 0) {
                word.append(' ');
            } else {
                // Find the number of digits
                int digitCount = (int) Math.log10(Math.abs(number)) + 1;

                // Find the main digit
                int mainDigit = Character.getNumericValue(Integer.toString(number).charAt(0));

                // Find the offset using the formula
                int offset = (mainDigit - 2) * 3;

                // Adjust offset for digits 8 or 9
                if (mainDigit == 8 || mainDigit == 9) {
                    offset++;
                }

                // Find the letter index
                int letterIndex = offset + digitCount - 1;

                // Add the letter index to ASCII code of 'a'
                char resultLetter = (char) ('a' + letterIndex);

                word.append(resultLetter);
            }

            // Check if there are more digits to read
            if (i < digits - 1) {
                scanner.skip("\\s+"); // Skip any whitespace characters
            }
        }

        System.out.println(word);
    }
}
