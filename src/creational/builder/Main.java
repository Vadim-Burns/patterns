package creational.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer.ComputerBuilder().build();
        System.out.println(computer1);

        Computer computer2 = new Computer.ComputerBuilder()
                .setCPU("AMD")
                .setHDD("500GB")
                .setIsGPUEnabled(true)
                .build();
        System.out.println(computer2);
    }
}
