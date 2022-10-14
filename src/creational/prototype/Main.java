package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(
                "AMD",
                "1TB",
                "8GB",
                true,
                false
        );
        System.out.println(computer1);
        Computer computer2 = computer1.clone();
        System.out.println(computer2);
    }
}
