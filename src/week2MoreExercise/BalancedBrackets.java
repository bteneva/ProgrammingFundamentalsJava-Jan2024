package week2MoreExercise;
import java.util.Scanner;
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int openCount =0;
        int closeCount =0;
        int concequitiveCount =0;
        for (int i = 0; i < numberOfLines ; i++) {
            char ch = scanner.nextLine().charAt(0);
            if (ch == '('){
                openCount += 1;
                concequitiveCount +=1;
                if (concequitiveCount == 2){
                    System.out.println("UNBALANCED");
                    return;
                }
            }
            else if (ch == ')') {
                closeCount += 1;
                concequitiveCount = 0;
            }
            else {
                concequitiveCount = 0;
            }

    }
        if (openCount == closeCount){
            System.out.println("BALANCED");
        }
        else System.out.println("UNBALANCED");
    }
}
