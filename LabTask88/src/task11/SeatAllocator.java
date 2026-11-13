package task11;

public class SeatAllocator {
    private int nextRow = 12;
    private char nextLetter = 'A';

    public String allocateSeat() {
        String seat = nextRow + String.valueOf(nextLetter);

        // Логика перехода на следующий ряд/место
        nextLetter++;
        if (nextLetter > 'F') {
            nextLetter = 'A';
            nextRow++;
        }
        return seat;
    }
}