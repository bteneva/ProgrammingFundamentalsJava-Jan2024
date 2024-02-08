package week2exercise;
import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        byte Y = Byte.parseByte(scanner.nextLine());
        int counter = 0;
        int OriginalN = N;
        while (N >= M && M > 0){
            N -= M;
            counter++ ;
            if (N == OriginalN/2.0 && Y > 0){
                N = N / Y;
            }
        }
        System.out.println(N);
        System.out.println(counter);

    }
}
