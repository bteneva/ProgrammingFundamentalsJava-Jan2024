package week2exercise;
import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        int maxSnowballValue =0;
        int maxSnowballQuality =0;
        int maxSnowballTime =0;
        int maxSnowballSnow = 0;
        for (int i = 0; i < numberSnowballs ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int snowballValue = (int) Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (maxSnowballValue < snowballValue){
                maxSnowballValue = snowballValue;
                maxSnowballQuality = snowballQuality;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %d (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
    }
}
