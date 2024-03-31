import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }

            courses.get(courseName).add(studentName);

            input = scanner.nextLine();
        }

        courses.forEach((course, students) -> {
            System.out.println(course + ": " + students.size() );
            students.forEach(student -> System.out.println("-- " + student));
        });
    }
}
