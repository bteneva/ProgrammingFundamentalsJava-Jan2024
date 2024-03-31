package ObjectAndClasses.OpinionPoll;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[0];
            int age = Integer.parseInt(command[1]);

            Person person = new Person(name, age);
            if (age > 30) {
                personList.add(person);
            }
        }
        for (Person person : personList) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }


    }
}
