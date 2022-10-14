package creational.factory.coffees;

public class Americano implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing americano");
    }

    @Override
    public void drink() {
        System.out.println("Drinking americano");
    }

    @Override
    public String getName() {
        return "americano";
    }
}
