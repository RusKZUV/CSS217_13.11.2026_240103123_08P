package task03;

public class Main3 {
    public static void main(String[] args) {
        ComputerFacade pc = new ComputerFacade(
                new PowerSupply(), new BIOS(), new HardDrive(), new OperatingSystem());
        pc.startComputer();
        System.out.println();
        pc.shutdownComputer();
    }
}
