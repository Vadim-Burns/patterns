package creational.factory.coffees;

public class Espresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Drinking espresso");
    }

    @Override
    public void drink() {
        System.out.println("Drinking espresso");
    }

    @Override
    public String getName() {
        return "espresso";
    }
}
