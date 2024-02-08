import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;
        if (typePeople.equals("Students")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
            if (peopleCount >= 30) {
                price *= 0.85;
            }

        } else if (typePeople.equals("Business")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16.00;
                    break;
            }
            if (peopleCount >= 100) {
                peopleCount -= 10;
            }

        } else if (typePeople.equals("Regular")) {
            switch (dayOfWeek) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.5;
                    break;
            }
            if (peopleCount >= 10 && peopleCount <= 20) {
                price *= 0.95;
            }
        }
        totalPrice = price * peopleCount;
        System.out.printf("Total price: %.2f", totalPrice);
    }

}