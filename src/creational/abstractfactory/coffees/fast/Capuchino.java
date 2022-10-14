package creational.abstractfactory.coffees.fast;

import creational.abstractfactory.coffees.Coffee;

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
