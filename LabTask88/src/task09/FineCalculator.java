package task09;

import java.util.HashMap;
import java.util.Map;

public class FineCalculator {
    // Задолженности студентов
    private final Map<String, Double> fines = new HashMap<>();

    public FineCalculator() {
        // Для теста: у студента S002 есть долг
        fines.put("S002", 15.50);
    }

    public double getBalance(String studentId) {
        return fines.getOrDefault(studentId, 0.0);
    }
}