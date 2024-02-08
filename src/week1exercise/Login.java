
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        int passwordTrials =0;


        for (int position = username.length()-1; position >=0 ; position--) {
            password += username.charAt(position);

        }
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){

            passwordTrials +=1;
            if (passwordTrials >= 4){

                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.printf("Incorrect password. Try again.");
            System.out.println();
            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);


    }
}
