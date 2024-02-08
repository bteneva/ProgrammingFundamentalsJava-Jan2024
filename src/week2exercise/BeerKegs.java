package week2exercise;
import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxvolume =0;
        String maxKeg = "";
        for (int i = 0; i < n ; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (maxvolume < volume){
                maxKeg = model;
                maxvolume = volume;
            }
        }
        System.out.println(maxKeg);
    }
}
