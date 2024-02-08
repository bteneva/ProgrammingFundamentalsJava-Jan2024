package week2MoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cycles = Integer.parseInt(scanner.nextLine());

        for (int m = 0; m < cycles; m++) {
            String input = scanner.nextLine();
            String input1 = "";
            String input2 = "";
            String a = "";
            long sum = 0; // Use long to handle larger sums

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar != ' ') {
                    input2 += currentChar;
                } else {
                    input1 = input2;
                    input2 = "";
                    continue;
                }
            }

            long number1 = Long.parseLong(input1);
            long number2 = Long.parseLong(input2);

            if (number1 > number2) {
                a = input1;
            } else {
                a = input2;
            }

            long number = Long.parseLong(a);
            number = Math.abs(number);
            while (number>0){
                sum += (number % 10);
                number /= 10;
            }

            System.out.println(sum);
        }
    }
}
