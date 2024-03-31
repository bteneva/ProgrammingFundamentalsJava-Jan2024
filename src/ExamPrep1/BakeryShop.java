package ExamPrep1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        int totalSold = 0;

        while (!input.equals("Complete")){
            int quantitySold = 0;
            String[] commandArr = input.split("\\s");
            String product = commandArr[2];
            int quantity = Integer.parseInt(commandArr[1]);
            String command = commandArr[0];
            if (command.equals("Receive")){
                if (quantity > 0) {
                    if (!productQuantity.containsKey(product)) {
                        productQuantity.put(product, quantity);
                    } else {
                        quantity += productQuantity.get(product);
                        productQuantity.put(product, quantity);
                    }
                }
            }
            else if (command.equals("Sell")){
                if (!productQuantity.containsKey(product)){
                    System.out.printf("You do not have any %s.%n", product);
                }
                else{
                    int quantityAfterSell = productQuantity.get(product) - quantity;
                    if (quantityAfterSell < 0){
                        System.out.printf("There aren't enough %s. You sold the last %d of them.%n", product, productQuantity.get(product));
                        quantitySold +=productQuantity.get(product);
                        productQuantity.remove(product);

                    }
                    else if (quantityAfterSell > 0){
                        System.out.printf("You sold %d %s.%n", quantity, product);
                        quantitySold +=quantity;
                        productQuantity.put(product, quantityAfterSell);

                    }
                    else {
                        quantitySold +=quantity;
                        System.out.printf("You sold %d %s.%n", quantity, product);
                        productQuantity.remove(product);
                    }
                }
                totalSold += quantitySold;

            }


            input = scanner.nextLine();
        }
        productQuantity.forEach((product, quantity) -> System.out.printf("%s: %d%n", product, quantity));
        System.out.printf("All sold: %d goods%n", totalSold);
    }
}
