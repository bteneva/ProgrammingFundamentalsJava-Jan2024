package Week7AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> register = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String username = input.split(" ")[1];

            if (command.equals("register")) {
                String registrationPlate = input.split(" ")[2];
                if (!register.containsKey(username)) {
                    register.put(username, registrationPlate);
                    System.out.printf("%s registered %s successfully%n", username, registrationPlate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", register.get(username));
                }
            } else if (command.equals("unregister")) {
                if (register.containsKey(username)) {
                    register.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                } else {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
            }
        }

        register.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
