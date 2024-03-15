package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        int shootCount = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);

            // Check if the index is valid and the target is not shot
            if (index >= 0 && index < intArray.length && intArray[index] != -1) {
                int targetValue = intArray[index];
                shootCount++;

                // Mark the target as shot
                intArray[index] = -1;

                // Loop through the array and modify the elements
                for (int i = 0; i < intArray.length; i++) {
                    // Skip the shot target
                    if (intArray[i] == -1) {
                        continue;
                    }

                    // Increase or decrease the element value
                    if (targetValue > intArray[i]) {
                        intArray[i] += targetValue;
                    } else {
                        intArray[i] -= targetValue;
                    }
                }
            }

            // Read the next command
            command = scanner.nextLine();
        }

        // Print the array
        String arrayToPrint = Arrays.toString(intArray)
                .replace(",", "") // Remove commas
                .replace("[", "") // Remove opening bracket
                .replace("]", ""); // Remove closing bracket

        System.out.printf("Shot targets: %d -> %s%n", shootCount, arrayToPrint);
    }
}
