package week4Methods;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        long numberPowered = mathPower(number, power);
        System.out.println(numberPowered);
    }

    public static long mathPower(int number, int power) {
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;
    }
}
