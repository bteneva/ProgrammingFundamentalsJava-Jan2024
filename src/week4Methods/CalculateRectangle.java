package week4Methods;
import java.util.Scanner;
public class CalculateRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double area = calcucateArea(width,length);
        System.out.printf("%.0f",area);

    }
    public static double calcucateArea(double width, double length){
        return width*length;
    }
}
