package creational.abstractfactory.coffees.careful;

import creational.abstractfactory.coffees.Coffee;

public class CarefulAmericano implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Careful preparation americano");
    }

    @Override
    public void drink() {
        System.out.println("Careful drinking americano");
    }

    @Override
    public String getName() {
        return "americano";
    }
}
