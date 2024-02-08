package week3Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] liftWagonStateArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int wagonCapacity = 4;

        for (int i = 0; i < liftWagonStateArray.length; i++) {
            people = people -(wagonCapacity-liftWagonStateArray[i]);
            if (people>0){
                liftWagonStateArray[i] = wagonCapacity;

            }
            else if(people == 0){
                liftWagonStateArray[i] = wagonCapacity;
                break;

            }
            else {
                System.out.print("The lift has empty spots!");
                liftWagonStateArray[i] += wagonCapacity - Math.abs(people);
                break;
            }
        }
        if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!", people);
        }
        System.out.println();
        for (int i : liftWagonStateArray) {
            System.out.print(i + " ");
        }

        }
    }

