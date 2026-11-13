package task06;

public class AquariumFacade {
    private final WaterFilter filter;
    private final AquariumHeater heater;
    private final AutoFeeder feeder;
    private final LedHoodLight light;

    public AquariumFacade(WaterFilter filter, AquariumHeater heater, AutoFeeder feeder, LedHoodLight light) {
        this.filter = filter;
        this.heater = heater;
        this.feeder = feeder;
        this.light = light;
    }

    public void runMorningRoutine() {
        System.out.println("=== Morning Routine ===");
        filter.cycle();
        heater.regulate(25);
        feeder.dispensePinch();
        light.daylight();
    }

    public void prepareForNight() {
        System.out.println("=== Preparing for Night ===");
        feeder.dispensePinch();
        heater.regulate(23);
        light.moonlight();
    }
}