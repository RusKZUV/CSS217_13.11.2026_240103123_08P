package task01;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final Projector projector;
    private final StreamingPlayer player;
    private final TheaterLights lights;

    public HomeTheaterFacade(Amplifier amplifier, Projector projector,
                             StreamingPlayer player, TheaterLights lights) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.player = player;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("=== Preparing Home Theater ===");
        lights.dim(15);
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(65);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("=== Shutting Down Home Theater ===");
        player.stop();
        player.off();
        amplifier.off();
        projector.off();
        lights.on();
    }
}
