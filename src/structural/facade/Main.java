package structural.facade;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        GPU gpu = new GPU();
        RAM ram = new RAM();
        Display display = new Display();

        // Предположим вам нужно что-то вычислить и вывести на экран, без фасада это будет выглядеть так:
        int calculated = cpu.calculate();
        ram.save(calculated);
        int rendered = gpu.render(ram);
        display.print(rendered);

        // Но если использовать facade(в данном случае это наш компьютер), то все упрощается
        Computer computer = new Computer(cpu, gpu, ram, display);
        computer.calculateAndShow();
    }
}
