package task08;

public class Main8 {
    public static void main(String[] args) {
        CarIgnitionFacade car = new CarIgnitionFacade(
                new Battery(),
                new FuelPump(),
                new StarterMotor(),
                new DashboardDisplay()
        );

        // Симуляция полного цикла поездки
        car.startEngine();
        System.out.println();
        car.stopEngine();
    }
}