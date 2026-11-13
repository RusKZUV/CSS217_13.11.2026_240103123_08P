package task09;

public class LoanRecorder {
    public void recordLoan(String studentId, String isbn) {
        System.out.println("[LoanRecorder] Successfully recorded loan: " + studentId + " borrowed " + isbn);
    }
}