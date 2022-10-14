package creational.factory.coffees;

public class Capuchino implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing capuchino");
    }

    @Override
    public void drink() {
        System.out.println("Drinking capuchino");
    }

    @Override
    public String getName() {
        return "capuchino";
    }
}
