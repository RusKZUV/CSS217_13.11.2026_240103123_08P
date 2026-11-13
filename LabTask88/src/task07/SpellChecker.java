package task07;

public class SpellChecker {
    public String inspect(String text) {
        System.out.println("[SpellChecker] Inspected " + text.split("\\s+").length + " words.");
        return text; // Предполагаем, что текст уже без ошибок
    }
}