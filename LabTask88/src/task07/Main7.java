package task07;

public class Main7  {
    public static void main(String[] args) {
        DocumentFacade docFacade = new DocumentFacade(
                new SpellChecker(),
                new PageFormatter(),
                new PdfConverter(),
                new PrinterSpooler()
        );

        String myText = "The quick brown fox jumps over the lazy dog.";

        docFacade.printCleanDocument(myText);
        System.out.println();
        docFacade.exportAsPdf(myText, "report_2026.pdf");
    }
}