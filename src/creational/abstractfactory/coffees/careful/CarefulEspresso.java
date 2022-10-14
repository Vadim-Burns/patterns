package creational.abstractfactory.coffees.careful;

import creational.abstractfactory.coffees.Coffee;

public class CarefulEspresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Careful preparation espresso");
    }

    @Override
    public void drink() {
        System.out.println("Careful drinking espresso");
    }

    @Override
    public String getName() {
        return "espresso";
    }
}
