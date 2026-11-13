package task04;

public class SmartRoomFacade {
    private final CeilingLight light;
    private final Thermostat thermostat;
    private final WindowBlinds blinds;
    private final DoorLock door;

    public SmartRoomFacade(CeilingLight light, Thermostat thermostat,
                           WindowBlinds blinds, DoorLock door) {
        this.light = light; this.thermostat = thermostat;
        this.blinds = blinds; this.door = door;
    }

    public void activateNightMode() {
        System.out.println("=== Night Mode ===");
        light.off();
        blinds.close();
        door.lock();
        thermostat.setTemperature(19);
    }

    public void activateMorningMode() {
        System.out.println("=== Morning Mode ===");
        blinds.open();
        light.on();
        door.unlock();
        thermostat.setTemperature(22);
    }
}