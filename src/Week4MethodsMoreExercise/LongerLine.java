package Week4MethodsMoreExercise;
import java.util.Scanner;
public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int u1 = Integer.parseInt(scanner.nextLine());
        int v1 = Integer.parseInt(scanner.nextLine());
        int u2 = Integer.parseInt(scanner.nextLine());
        int v2 = Integer.parseInt(scanner.nextLine());

        if (calculateLength(x1, y1, x2, y2) >= (calculateLength(u1, v1, u2, v2))){
            printClosestPoint(x1, y1, x2, y2);
            printNotClosestPoint(x1, y1, x2, y2);

        }
        else if(calculateLength(x1, y1, x2, y2) < (calculateLength(u1, v1, u2, v2))){
            printClosestPoint(u1, v1, u2, v2);
            printNotClosestPoint(u1, v1, u2, v2);
        }

    }
    public static double calculateLength(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void printClosestPoint (int x1, int y1, int x2, int y2){
        int distance1 = x1*x1 + y1*y1;
        int distance2 = x2*x2 + y2*y2;
        if (distance1 <= distance2){
            System.out.printf("(%d, %d)", x1, y1);
        }
        else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
    public static void printNotClosestPoint (int x1, int y1, int x2, int y2){
        int distance1 = x1*x1 + y1*y1;
        int distance2 = x2*x2 + y2*y2;
        if (distance1 <= distance2){
            System.out.printf("(%d, %d)", x2, y2);
        }
        else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}
