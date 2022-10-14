package creational.abstractfactory.coffees.fast;

import creational.abstractfactory.coffees.Coffee;

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
