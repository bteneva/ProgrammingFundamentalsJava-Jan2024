import java.util.Scanner;
import java.lang.Math;
public class padwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyGLucasHas = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double singleLightSaberPrice = Double.parseDouble(scanner.nextLine());
        double singleRobePrice = Double.parseDouble(scanner.nextLine());
        double singleBeltPrice = Double.parseDouble(scanner.nextLine());

        //calculations
        int sabersCount = (int) Math.ceil(studentsCount * 1.1);
        double sabersCost = singleLightSaberPrice*sabersCount;
        int beltCount = studentsCount - (studentsCount / 6 );
        double beltsCost = singleBeltPrice * beltCount;
        double robesCost = singleRobePrice * studentsCount;

        double totalCost = sabersCost + beltsCost + robesCost;
        double moneyLeft = moneyGLucasHas - totalCost;
        if (moneyLeft >= 0){
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }
        else System.out.printf("George Lucas will need %.2flv more.", Math.abs(moneyLeft));


    }
}
