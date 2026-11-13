package task07;

public class DocumentFacade {
    private final SpellChecker spellChecker;
    private final PageFormatter formatter;
    private final PdfConverter converter;
    private final PrinterSpooler spooler;

    public DocumentFacade(SpellChecker spellChecker, PageFormatter formatter,
                          PdfConverter converter, PrinterSpooler spooler) {
        this.spellChecker = spellChecker;
        this.formatter = formatter;
        this.converter = converter;
        this.spooler = spooler;
    }

    public void printCleanDocument(String text) {
        System.out.println("=== Print Clean Document ===");
        String cleanText = spellChecker.inspect(text);
        String formattedText = formatter.applyA4(cleanText);
        spooler.queue(formattedText);
    }

    public void exportAsPdf(String text, String fileName) {
        System.out.println("=== Export PDF: " + fileName + " ===");
        String cleanText = spellChecker.inspect(text);
        String formattedText = formatter.applyA4(cleanText);
        byte[] pdfBytes = converter.convert(formattedText);
        System.out.println("[DocumentFacade] Successfully wrote " + pdfBytes.length + " bytes to " + fileName);
    }
}