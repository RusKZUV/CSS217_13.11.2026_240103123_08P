package task10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomAvailability {
    // Словарь: тип номера -> список доступных номеров
    private final Map<String, List<Integer>> availableRooms = new HashMap<>();
    // Словарь: тип номера -> цена за ночь
    private final Map<String, Double> nightlyRates = new HashMap<>();

    public RoomAvailability() {
        // Инициализация цен
        nightlyRates.put("SINGLE", 85.0);
        nightlyRates.put("DOUBLE", 120.0);
        nightlyRates.put("SUITE", 250.0);

        // Инициализация доступных номеров
        availableRooms.put("SINGLE", new ArrayList<>(List.of(101, 102)));
        availableRooms.put("DOUBLE", new ArrayList<>(List.of(201, 202)));
        availableRooms.put("SUITE", new ArrayList<>(List.of(301)));
    }

    public int assignRoom(String roomType) {
        List<Integer> rooms = availableRooms.get(roomType.toUpperCase());
        if (rooms == null || rooms.isEmpty()) {
            return -1; // Нет свободных номеров данного типа
        }
        // Забираем первый доступный номер из списка
        return rooms.remove(0);
    }

    public void releaseRoom(int roomNumber) {
        // Определяем тип номера по первой цифре и возвращаем в список
        if (roomNumber >= 100 && roomNumber < 200) {
            availableRooms.get("SINGLE").add(roomNumber);
        } else if (roomNumber >= 200 && roomNumber < 300) {
            availableRooms.get("DOUBLE").add(roomNumber);
        } else if (roomNumber >= 300) {
            availableRooms.get("SUITE").add(roomNumber);
        }
        System.out.println("[RoomAvailability] Room " + roomNumber + " is now available.");
    }

    public double getNightlyRate(String roomType) {
        return nightlyRates.getOrDefault(roomType.toUpperCase(), 0.0);
    }
}