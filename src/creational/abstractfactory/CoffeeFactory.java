package creational.abstractfactory;

import creational.abstractfactory.coffees.Coffee;
import creational.abstractfactory.coffees.CoffeeEnum;

public interface CoffeeFactory {
    Coffee prepareCoffee(CoffeeEnum coffeeType);
}
