package Week3Exercise;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] peopleInWagons = new int[numberOfWagons];
        int sum = 0;
        for (int i = 0; i < numberOfWagons; i++) {
            peopleInWagons[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleInWagons[i];

        }
        for (int peopleInWagon : peopleInWagons) {
            System.out.print(peopleInWagon + " ");
        }


        System.out.println();
        System.out.println(sum);
    }
}
