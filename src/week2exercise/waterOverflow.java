package week2exercise;
import java.util.Scanner;
public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tankCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int waterInTank =0;
        for (int i = 0; i < n; i++) {
            int waterIn = Integer.parseInt(scanner.nextLine());
            if (waterIn > tankCapacity){
                System.out.println("Insufficient capacity!");
            }
            else{
                tankCapacity -= waterIn;
                waterInTank += waterIn;
            }

        }

        System.out.println(waterInTank);
    }
}
