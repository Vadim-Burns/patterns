package creational.builder;

public class Computer {
    private final String CPU;
    private final String HDD;
    private final String RAM;

    private final boolean isBluetoothEnabled;
    private final boolean isGPUEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.CPU = computerBuilder.CPU;
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;

        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGPUEnabled = computerBuilder.isGPUEnabled;
    }

    public static class ComputerBuilder {
        private String CPU = "Intel i5 10400";
        private String HDD = "1TB";
        private String RAM = "4GB";

        private boolean isBluetoothEnabled = false;
        private boolean isGPUEnabled = false;

        public ComputerBuilder() {}

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setIsBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setIsGPUEnabled(boolean isGPUEnabled) {
            this.isGPUEnabled = isGPUEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                ", isGPUEnabled=" + isGPUEnabled +
                '}';
    }
}
