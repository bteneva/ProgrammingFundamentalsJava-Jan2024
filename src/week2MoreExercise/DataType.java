import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String type ="";

        while (!command.equals("END")) {
            int countDot =0;
            if (command.length() == 1){
                char symbol = command.charAt(0);
                if (symbol < 48 || symbol >=58){
                    type = "charakter";
                }
                else {
                    type = "integer";
                }
            }
            else{
                if ((command.equalsIgnoreCase("true")) || (command.equalsIgnoreCase("false"))){
                    type = "boolean";
                }
                else if (command.startsWith("-")){
                    for (int i = 1; i < command.length() ; i++) {
                        char symbol = command.charAt(i);
                        if (symbol>=48 && symbol <= 57){
                            type = "integer";
                        }
                        else if (symbol == 46){
                             countDot +=1;}
                        if (countDot >1){
                            type = "string";
                            }
                        else {
                            type = "floating point";
                            }
                        }


                    }
                }

            }

            System.out.printf("%s is %s type%n", command, type);
            command = scanner.nextLine();
        }
    }

