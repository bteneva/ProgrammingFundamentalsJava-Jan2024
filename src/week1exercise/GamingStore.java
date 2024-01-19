import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;
        double sumSpent = 0;

        while (!command.equals("Game Time")) {
            String game = command;
            boolean notFound = false;

            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    notFound = true;
                    break;
            }

            if (balance >price && !notFound) {
                System.out.printf("Bought %s%n", game);
                balance -= price;
            }
            else if (balance == price && !notFound){
                System.out.println("Out of mo-ney!");

            }
            else if (balance < price && !notFound){
                System.out.println("Too Expensive");
            }

            // Read the next command
            command = scanner.nextLine();
            sumSpent += price;

        }

        System.out.printf("Total spent: $%.2f%", sumSpent);
        System.out.printf("Remaining: $%.2f%", balance);
    }
}
