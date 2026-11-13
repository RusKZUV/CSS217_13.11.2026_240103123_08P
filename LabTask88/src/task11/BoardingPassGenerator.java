package task11;

public class BoardingPassGenerator {
    public String generatePass(String bookingRef, String seat) {
        return "==============================\n" +
                "       BOARDING PASS          \n" +
                "==============================\n" +
                " Booking Ref : " + bookingRef + "\n" +
                " Seat        : " + seat + "\n" +
                " Status      : CHECKED IN     \n" +
                "==============================";
    }
}