package service;

import java.util.*;
import java.util.stream.Collectors;
import Model.Student;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student("An", 20, 8.5));
        students.add(new Student("Binh", 22, 6.5));
        students.add(new Student("Cuong", 21, 9.0));
        students.add(new Student("Dung", 20, 7.0));
        students.add(new Student("An", 23, 9.5));
    }

    public Optional<Student> findByName(String name) {
        return students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Student> getExcellentStudents() {
        return students.stream()
                .filter(s -> s.getScore() >= 8)
                .collect(Collectors.toList());
    }

    public List<String> getAllNames() {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public List<Student> sortByScoreDesc() {
        return students.stream()
                .sorted((a, b) ->
                        Double.compare(b.getScore(), a.getScore()))
                .collect(Collectors.toList());
    }

    public double averageScore() {
        return students.stream()
                .mapToDouble(Student::getScore)
                .average()
                .orElse(0);
    }

    public boolean hasPerfectScore() {
        return students.stream()
                .anyMatch(s -> s.getScore() == 10);
    }

    public Map<Integer, List<Student>> groupByAge() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getAge));
    }
}
