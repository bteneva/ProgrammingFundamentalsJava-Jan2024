package ObjectAndClasses.Lab.Articles;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];
        int n = Integer.parseInt(scanner.nextLine());
        Articles article = new Articles(title, content, author);
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String action = command.split(": ")[0];
            String parameter = command.split(": ")[1];

            switch (action){
                case "Edit":
                    String newContent = parameter;
                    article.Edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = parameter;
                    article.ChangeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = parameter;
                    article.Rename(newTitle);
                    break;
            }

        }
        System.out.println(article.toString());

    }
}


