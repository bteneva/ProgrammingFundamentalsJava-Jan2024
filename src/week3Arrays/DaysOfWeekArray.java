package week3Arrays;
import java.util.Scanner;
public class DaysOfWeekArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum = Integer.parseInt(scanner.nextLine());
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (dayNum>0 && dayNum<8) {
            System.out.println(daysOfWeek[dayNum - 1]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
