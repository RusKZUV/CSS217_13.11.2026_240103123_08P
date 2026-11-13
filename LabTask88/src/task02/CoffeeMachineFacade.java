package task02;

public class CoffeeMachineFacade {
    private final WaterHeater heater;
    private final CoffeeGrinder grinder;
    private final BrewUnit brewUnit;
    private final CupDispenser dispenser;

    public CoffeeMachineFacade(WaterHeater heater, CoffeeGrinder grinder,
                               BrewUnit brewUnit, CupDispenser dispenser) {
        this.heater = heater; this.grinder = grinder;
        this.brewUnit = brewUnit; this.dispenser = dispenser;
    }

    public void brewEspresso() {
        System.out.println("=== Espresso ===");
        dispenser.dispenseCup();
        heater.heatWater(92);
        grinder.grindBeans("fine");
        brewUnit.brew(25);
    }

    public void brewAmericano() {
        System.out.println("=== Americano ===");
        dispenser.dispenseCup();
        heater.heatWater(95);
        grinder.grindBeans("medium");
        brewUnit.brew(40);
        System.out.println("[WaterHeater] Adding extra hot water.");
    }
}