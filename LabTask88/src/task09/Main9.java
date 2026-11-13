package task09;

public class Main9 {
    public static void main(String[] args) {
        LibraryCheckoutFacade library = new LibraryCheckoutFacade(
                new MemberValidator(),
                new CatalogService(),
                new FineCalculator(),
                new LoanRecorder()
        );

        // Тест 1: Успешная выдача (Активный студент, нет долгов, книга есть)
        System.out.println("Test 1 Result: " + library.borrowBook("S001", "ISBN-101"));
        System.out.println();

        // Тест 2: Отказ (У студента есть долг)
        System.out.println("Test 2 Result: " + library.borrowBook("S002", "ISBN-102"));
        System.out.println();

        // Тест 3: Отказ (Неактивный студент)
        System.out.println("Test 3 Result: " + library.borrowBook("S999", "ISBN-102"));
        System.out.println();

        // Тест 4: Отказ (Книгу уже забрали в Тесте 1)
        System.out.println("Test 4 Result: " + library.borrowBook("S003", "ISBN-101"));
        System.out.println();

        // Возврат книги и повторная попытка
        library.returnBook("S001", "ISBN-101");
        System.out.println();
        System.out.println("Test 5 Result (after return): " + library.borrowBook("S003", "ISBN-101"));
    }
}