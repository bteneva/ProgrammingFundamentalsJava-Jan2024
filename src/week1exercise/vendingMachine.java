import java.util.Scanner;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String command = scanner.nextLine();


        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.1f%n", coin);
            }

            command = scanner.nextLine(); // Read the next command
        }

        // Purchase products
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            double price = 0;

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    product = scanner.nextLine(); // Read the next product
                    continue; // Skip to the next iteration
            }

            if (sum < price) {
                System.out.println("Sorry, not enough money");
            } else {
                sum -= price;
                System.out.printf("Purchased %s%n", product);
            }

            product = scanner.nextLine(); // Read the next product
        }

        System.out.printf("Change: %.2f%n", sum);
    }
}
