package creational.factory;

import creational.factory.coffees.*;

public class CoffeeFactory {
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
