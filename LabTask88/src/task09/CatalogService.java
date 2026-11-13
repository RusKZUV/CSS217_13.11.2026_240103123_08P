package task09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CatalogService {
    // Доступные книги по ISBN
    private final Set<String> availableBooks = new HashSet<>(Arrays.asList("ISBN-101", "ISBN-102", "ISBN-103"));

    public boolean isAvailable(String isbn) {
        return availableBooks.contains(isbn);
    }

    public void checkout(String isbn) {
        availableBooks.remove(isbn);
        System.out.println("[CatalogService] Book " + isbn + " checked out from catalog.");
    }

    public void restore(String isbn) {
        availableBooks.add(isbn);
        System.out.println("[CatalogService] Book " + isbn + " returned to catalog.");
    }
}