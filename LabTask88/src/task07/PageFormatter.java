package task07;

public class PageFormatter {
    public String applyA4(String text) {
        System.out.println("[PageFormatter] A4 margins applied.");
        return "<A4>" + text + "</A4>";
    }
}