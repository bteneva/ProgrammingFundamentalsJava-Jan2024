import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = ">>(?<product>[A-Z][a-zA-Z]*)<<(?<price>\\d+(\\.\\d+)?)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        double totalMoneySpent = 0;
        List<String> boughtFurniture = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalMoneySpent += price * quantity;
                boughtFurniture.add(product);

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s : boughtFurniture) {
            System.out.println(s);
        }
        System.out.printf("Total money spend: %.2f", totalMoneySpent);
    }
}
