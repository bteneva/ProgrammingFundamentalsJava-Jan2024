package ExamPrep1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(#|\\|)(?<product>\\s*[A-Za-z]+\\s*[A-Za-z]*)\\1(?<date>[0-3][0-9]\\/[0-1][0-9]\\/[0-2][0-9])\\1(?<calories>[0-9]+){1,5}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Map<String, Integer> productCalories = new LinkedHashMap<>();
        Map<String, String> productExpiration = new LinkedHashMap<>();
        int totalCalories = 0;
        while (matcher.find()) {
            String product = matcher.group(2);
            String date = matcher.group(3);
            int calories = Integer.parseInt(matcher.group(4));
            if (!productCalories.containsKey(product)) {
                productCalories.put(product, calories);
            }
            else {
                productCalories.put(product, (productCalories.get(product) + calories));
            }
            totalCalories += calories;
            productExpiration.put(product, date);
        }
        int daysToLast = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", daysToLast);
        for (Map.Entry<String, Integer> entry : productCalories.entrySet()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",
                    entry.getKey(), productExpiration.get(entry.getKey()), entry.getValue());
        }


    }
}
