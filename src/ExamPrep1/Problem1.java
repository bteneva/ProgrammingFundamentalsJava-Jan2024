package ExamPrep1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Generate")){
            //    • "Contains>>>{substring}":
            //        ◦ If the raw activation key contains the given substring, prints: "{raw activation key} contains {substring}".
            //        ◦ Otherwise, prints: "Substring not found!"
            //    • "Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
            //        ◦ Changes the substring between the given indices (the end index is exclusive) to upper or lower case and then prints the activation key.
            //        ◦ All given indexes will be valid.
            //    • "Slice>>>{startIndex}>>>{endIndex}":
            //        ◦ Deletes the characters between the start and end indices (the end index is exclusive) and prints the activation key.
            //        ◦ Both indices will be valid.
            String command = input.split(">>>")[0];
            switch (command){
                case "Contains":
                    String substring = input.split(">>>")[1];
                    if (activationKey.contains(substring)){
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    }
                    else{
                        System.out.printf("Substring not found!%n");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(input.split(">>>")[2]);
                    int endIndex = Integer.parseInt(input.split(">>>")[3]);
                    String textToReplace = activationKey.substring(startIndex,endIndex);
                    String newText = "";
                    if (input.split(">>>")[1].equals("Upper")){
                        newText = textToReplace.toUpperCase();
                    }
                    else if(input.split(">>>")[1].equals("Lower")){
                       newText = textToReplace.toLowerCase();

                    }
                    activationKey = activationKey.replace(textToReplace, newText);

                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startIndex1 = Integer.parseInt(input.split(">>>")[1]);
                    int endIndex1 = Integer.parseInt(input.split(">>>")[2]);
                    StringBuilder sb1 = new StringBuilder(activationKey);
                    sb1.delete(startIndex1,endIndex1);
                    activationKey = sb1.toString();
                    System.out.println(activationKey);

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
