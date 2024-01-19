import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordersCount = Integer.parseInt(scanner.nextLine());
        double totalprice=0;
        for (int i = 0; i < ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double pricePerCoffee = pricePerCapsule*days*capsuleCount;
            System.out.printf("The price for the coffee is: $%.2f", pricePerCoffee);
            System.out.println();
            totalprice +=pricePerCoffee;
        }

        System.out.printf("Total: $%.2f", totalprice);
    }
}
