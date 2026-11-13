package task03;

public class ComputerFacade {
    private final PowerSupply power;
    private final BIOS bios;
    private final HardDrive drive;
    private final OperatingSystem os;

    public ComputerFacade(PowerSupply power, BIOS bios, HardDrive drive, OperatingSystem os) {
        this.power = power; this.bios = bios; this.drive = drive; this.os = os;
    }

    public void startComputer() {
        System.out.println("=== Booting Computer ===");
        power.supplyPower();
        bios.runPOST();
        drive.spinUp();
        drive.readBootSector();
        os.loadKernel();
    }

    public void shutdownComputer() {
        System.out.println("=== Shutting Down Computer ===");
        os.shutdown();
        drive.parkHeads();
        power.cutPower();
    }
}