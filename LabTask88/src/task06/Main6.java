package task06;

public class Main6  {
    public static void main(String[] args) {
        AquariumFacade tank = new AquariumFacade(
                new WaterFilter(),
                new AquariumHeater(),
                new AutoFeeder(),
                new LedHoodLight()
        );

        tank.runMorningRoutine();
        System.out.println();
        tank.prepareForNight();
    }
}