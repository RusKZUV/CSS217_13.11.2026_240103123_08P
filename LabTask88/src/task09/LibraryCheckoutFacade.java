package task09;

public class LibraryCheckoutFacade {
    private final MemberValidator validator;
    private final CatalogService catalog;
    private final FineCalculator fineCalc;
    private final LoanRecorder recorder;

    public LibraryCheckoutFacade(MemberValidator validator, CatalogService catalog,
                                 FineCalculator fineCalc, LoanRecorder recorder) {
        this.validator = validator;
        this.catalog = catalog;
        this.fineCalc = fineCalc;
        this.recorder = recorder;
    }

    public boolean borrowBook(String studentId, String isbn) {
        System.out.println("--- Processing Borrow Request for " + studentId + " ---");

        // 1. Проверка активности студента
        if (!validator.isActive(studentId)) {
            System.out.println("REJECTED: Student " + studentId + " is not active.");
            return false;
        }

        // 2. Проверка задолженностей
        if (fineCalc.getBalance(studentId) > 0) {
            System.out.println("REJECTED: Student owes $" + fineCalc.getBalance(studentId) + " in fines.");
            return false;
        }

        // 3. Проверка наличия книги
        if (!catalog.isAvailable(isbn)) {
            System.out.println("REJECTED: Book " + isbn + " is currently unavailable.");
            return false;
        }

        // 4. Выдача книги (если все проверки пройдены)
        catalog.checkout(isbn);
        recorder.recordLoan(studentId, isbn);
        return true;
    }

    public void returnBook(String studentId, String isbn) {
        System.out.println("--- Processing Return Request for " + isbn + " ---");
        catalog.restore(isbn);
        System.out.println("[LibraryCheckoutFacade] Return processed for " + studentId);
    }
}