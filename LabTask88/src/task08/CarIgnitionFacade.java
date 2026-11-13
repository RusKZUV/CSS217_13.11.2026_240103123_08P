package task08;

public class CarIgnitionFacade {
    private final Battery battery;
    private final FuelPump fuelPump;
    private final StarterMotor starterMotor;
    private final DashboardDisplay dashboard;

    public CarIgnitionFacade(Battery battery, FuelPump fuelPump,
                             StarterMotor starterMotor, DashboardDisplay dashboard) {
        this.battery = battery;
        this.fuelPump = fuelPump;
        this.starterMotor = starterMotor;
        this.dashboard = dashboard;
    }

    public void startEngine() {
        System.out.println("=== Starting Engine ===");
        if (!battery.checkVoltage()) {
            System.out.println("Cannot start: Battery voltage too low.");
            return;
        }
        fuelPump.prime();
        starterMotor.crank();
        dashboard.illuminate();
        System.out.println("Engine is running.");
    }

    public void stopEngine() {
        System.out.println("=== Stopping Engine ===");
        fuelPump.stop();
        dashboard.off();
        System.out.println("Engine stopped.");
    }
}