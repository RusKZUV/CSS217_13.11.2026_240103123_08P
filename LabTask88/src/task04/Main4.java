package task04;

public class Main4 {
    public static void main(String[] args) {
        SmartRoomFacade room = new SmartRoomFacade(
                new CeilingLight(), new Thermostat(), new WindowBlinds(), new DoorLock());
        room.activateNightMode();
        System.out.println();
        room.activateMorningMode();
    }
}