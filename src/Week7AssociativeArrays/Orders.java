package Week7AssociativeArrays;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> prices = new LinkedHashMap<>();
        Map<String, Integer> quantities = new LinkedHashMap<>();
        Map<String, Double> orders = new LinkedHashMap<>();
        while (!input.equals("buy")){
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);
            if (!prices.containsKey(name)) {
                prices.put(name, price);
                quantities.put(name, quantity);
            }
            else{
                prices.put(name, price);
                quantities.put(name, quantities.get(name)+ quantity);
            }

            input = scanner.nextLine();
        }

        for (String name : prices.keySet()) {
            double totalValue = prices.get(name) * quantities.get(name);
            orders.put(name, totalValue);
        }


        orders.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));
    }
}
