package task09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MemberValidator {
    // Список активных студентов
    private final Set<String> activeStudents = new HashSet<>(Arrays.asList("S001", "S002", "S003"));

    public boolean isActive(String studentId) {
        return activeStudents.contains(studentId);
    }
}