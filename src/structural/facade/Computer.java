package structural.facade;

public class Computer {
    private final CPU cpu;
    private final GPU gpu;
    private final RAM ram;
    private final Display display;

    public Computer(CPU cpu, GPU gpu, RAM ram, Display display) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.display = display;
    }

    void calculateAndShow() {
        int calculated = cpu.calculate();
        ram.save(calculated);
        int rendered = gpu.render(ram);
        display.print(rendered);
    }
}
