package task02;

public class Main2 {
    public static void main(String[] args) {
        CoffeeMachineFacade machine = new CoffeeMachineFacade(
                new WaterHeater(), new CoffeeGrinder(), new BrewUnit(), new CupDispenser());
        machine.brewEspresso();
        System.out.println();
        machine.brewAmericano();
    }
}
