package creational.abstractfactory;

import creational.abstractfactory.coffees.Coffee;
import creational.abstractfactory.coffees.CoffeeEnum;
import creational.abstractfactory.coffees.careful.CarefulAmericano;
import creational.abstractfactory.coffees.careful.CarefulCapuchino;
import creational.abstractfactory.coffees.careful.CarefulEspresso;

public class LongCoffeeFactoryIml implements CoffeeFactory {
    @Override
    public Coffee prepareCoffee(CoffeeEnum coffeeType) {
        Coffee coffee = null;

        switch (coffeeType) {
            case AMERICANO -> coffee = new CarefulAmericano();
            case ESPRESSO -> coffee = new CarefulEspresso();
            case CAPUCHINO -> coffee = new CarefulCapuchino();
        }

        coffee.prepare();
        return coffee;
    }
}
