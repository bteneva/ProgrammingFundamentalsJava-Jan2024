package Week7AssociativeArrays;

import java.util.*;



public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsGrades.containsKey(name)){
                studentsGrades.put(name, new ArrayList<>());
            }
            studentsGrades.get(name).add(grade);
        }
        studentsGrades.forEach((name, grades) -> {
            double average = calculateAverage(grades);
            if (average >= 4.50) {
                System.out.println(name + " -> " + String.format("%.2f", average));
            }
        });

    }

    private static double calculateAverage(List<Double> grades) {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

