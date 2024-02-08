package week4Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = calculateFinalPrice(product, quantity);

        if (price != -1) {
            System.out.printf("%.2f", price);
        }
    }

    private static double calculateFinalPrice(String product, int quantity) {
        double price = 0;

        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
            default:
                System.out.println("Invalid product");
                return -1;
        }

        return price * quantity;
    }
}
