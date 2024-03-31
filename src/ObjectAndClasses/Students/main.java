package ObjectAndClasses.Students;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> studentsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        String[] input = scanner.nextLine().split(" ");
        String firstName = input[0];
        String secondName = input[1];
        double grade = Double.parseDouble(input[2]);
        Students student = new Students(firstName, secondName, grade);
        studentsList.add(student);
        }
        Collections.sort(studentsList, Comparator.comparingDouble(Students::getGrade).reversed());
        for (Students students : studentsList) {
            System.out.printf("%s %s: %.2f%n", students.getFirstName(), students.getSecondName(), students.getGrade());
        }
    }
}
