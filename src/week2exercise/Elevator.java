package week2exercise;
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        int elevatorCourses = peopleCount / elevatorCapacity;
        if ( peopleCount % elevatorCapacity != 0){
            elevatorCourses +=1;
        }
        System.out.println(elevatorCourses);


    }
}
