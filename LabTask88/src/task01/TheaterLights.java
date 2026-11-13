package task01;

public class TheaterLights {
    public void dim(int percent) {
        System.out.println("[TheaterLights] Dimming lights to " + percent + "%.");
    }
    public void on() {
        System.out.println("[TheaterLights] Lights restored to 100%.");
    }
}