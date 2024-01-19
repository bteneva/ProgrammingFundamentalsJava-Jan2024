import java.util.Scanner;

public class MetersToKilometers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputMeters = Integer.parseInt(scanner.nextLine());
        double resultKilometers = inputMeters / 1000.0;
        System.out.printf("%.2f", resultKilometers);

    }
}
