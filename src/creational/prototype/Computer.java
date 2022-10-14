package creational.prototype;

import java.util.concurrent.ThreadLocalRandom;

public class Computer implements Prototype<Computer> {
    private final Integer id;
    private final String CPU;
    private final String HDD;
    private final String RAM;

    private final boolean isBluetoothEnabled;
    private final boolean isGPUEnabled;

    public Computer(String CPU, String HDD, String RAM, boolean isBluetoothEnabled, boolean isGPUEnabled) {
        this.id = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.CPU = CPU;
        this.HDD = HDD;
        this.RAM = RAM;
        this.isBluetoothEnabled = isBluetoothEnabled;
        this.isGPUEnabled = isGPUEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", CPU='" + CPU + '\'' +
                ", HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                ", isGPUEnabled=" + isGPUEnabled +
                '}';
    }

    @Override
    public Computer clone() {
        return new Computer(
                this.CPU,
                this.HDD,
                this.RAM,
                this.isBluetoothEnabled,
                this.isGPUEnabled
        );
    }
}
