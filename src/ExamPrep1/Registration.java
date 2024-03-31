package ExamPrep1;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();
        while(!command.equals("Registration")){
            String[] commandArray = command.split("\\s");
            String action = commandArray[0];
            switch (action){
                case "Letters":
                    if (commandArray[1].contains("Lower")){
                        input = input.toLowerCase();
                        System.out.println(input);
                    }
                    else{
                        input = input.toUpperCase();
                        System.out.println(input);
                    }
                    break;
                case "Reverse":

                    int startIndex = Integer.parseInt(commandArray[1]);
                    int endIndex = Integer.parseInt(commandArray[2]);
                    if ((startIndex>0 && startIndex <= input.length()) &&
                            (endIndex > 0 && endIndex <= input.length())){
                        String stringCut = input.substring(startIndex, endIndex+1);
                        StringBuilder sb = new StringBuilder(stringCut);
                        sb.reverse();
                        System.out.println(sb.toString());
                    }
                    break;
                case "Substring":
                    String subString = commandArray[1];
                    if (input.contains(subString)) {
                        input = input.replace(subString, "");
                        System.out.println(input);
                    }
                    else {
                        System.out.printf("The username %s doesn't contain %s.%n", input, subString);
                    }
                    break;
                case "Replace":
                    String ch = commandArray[1];
                    input = input.replaceAll(ch, "-");
                    System.out.println(input);
                    break;
                case "IsValid":
                    String ch1 = commandArray[1];
                    if (input.contains(ch1)) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.%n", ch1);
                    }
                    break;
            }command = scanner.nextLine();
        }
    }
}
