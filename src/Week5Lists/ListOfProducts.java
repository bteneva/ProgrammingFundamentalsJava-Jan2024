import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            productList.add(product);
        }

        Collections.sort(productList);

        for (int i = 1; i <= productList.size(); i++) {
            System.out.printf("%d.%s%n", i, productList.get(i - 1));
        }
    }
}
