package creational.factory;

import creational.factory.coffees.Coffee;
import creational.factory.coffees.CoffeeEnum;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        for (CoffeeEnum coffeeType : CoffeeEnum.values()) {
            Coffee coffee = coffeeFactory.prepareCoffee(coffeeType);
            coffee.drink();
        }
    }
}
