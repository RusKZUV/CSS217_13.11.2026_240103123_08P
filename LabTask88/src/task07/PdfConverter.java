package task07;

public class PdfConverter {
    public byte[] convert(String text) {
        System.out.println("[PdfConverter] Converted text to PDF bytes.");
        return ("%PDF-" + text).getBytes();
    }
}