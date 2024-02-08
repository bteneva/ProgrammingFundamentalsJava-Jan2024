package week4Methods;
import java.util.Scanner;
public class gradePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        gradePrint(grade);

        }
    public static void gradePrint(double grade){
        if (grade>= 2.0 && grade <=2.99){
            System.out.println("Fail");
        }
        else if (grade >=3.0 &&  grade <=3.49){
            System.out.println("Poor");
        }
        else if (grade >= 3.50 && grade <= 4.49){
            System.out.println("Good");
        }
        else if (grade >= 4.50 && grade <= 5.49){
            System.out.println("Very good");
        }
        else if (grade >= 5.50){
            System.out.println("Excellent");
        }
    }
}
