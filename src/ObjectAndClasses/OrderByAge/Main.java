package ObjectAndClasses.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        while (!command.equals("End")) {
            String name = command.split(" ")[0];
            String ID = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);
            Person person = new Person(name, ID, age);
            personList.add(person);
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getID(), person.getAge());
        }

    }
}
