package creational.abstractfactory;

import creational.abstractfactory.coffees.*;
import creational.abstractfactory.coffees.fast.Americano;
import creational.abstractfactory.coffees.fast.Capuchino;
import creational.abstractfactory.coffees.fast.Espresso;

public class FastCoffeeFactoryIml implements CoffeeFactory {
    public Coffee prepareCoffee(CoffeeEnum coffeeType) {
        Coffee coffee = null;

        switch (coffeeType) {
            case ESPRESSO -> coffee = new Espresso();
            case AMERICANO -> coffee = new Americano();
            case CAPUCHINO -> coffee = new Capuchino();
        }
        coffee.prepare();

        return coffee;
    }
}
