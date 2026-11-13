package task01;

public class Main1 {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(), new Projector(), new StreamingPlayer(), new TheaterLights());

        homeTheater.watchMovie("The Java Chronicles");
        System.out.println();
        homeTheater.endMovie();
        System.out.println();

        homeTheater.watchMovie("Patterns of Design");
        System.out.println();
        homeTheater.endMovie();
    }
}