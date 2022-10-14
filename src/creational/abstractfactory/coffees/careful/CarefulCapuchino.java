package creational.abstractfactory.coffees.careful;

import creational.abstractfactory.coffees.Coffee;

public class CarefulCapuchino implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Careful preparation capuchino");
    }

    @Override
    public void drink() {
        System.out.println("Careful drinking capuchino");
    }

    @Override
    public String getName() {
        return "capuchino";
    }
}
