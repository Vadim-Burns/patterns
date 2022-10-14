package creational.abstractfactory;

import creational.abstractfactory.coffees.Coffee;
import creational.abstractfactory.coffees.CoffeeEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1 для растворимого кофе, 2 для качественного");
        Scanner in = new Scanner(System.in);
        int answ = in.nextInt();

        CoffeeFactory coffeeFactory = null;
        switch (answ) {
            case 1 -> coffeeFactory = new FastCoffeeFactoryIml();
            case 2 -> coffeeFactory = new LongCoffeeFactoryIml();
            default -> throw new ArrayIndexOutOfBoundsException();
        }

        for (CoffeeEnum coffeeType : CoffeeEnum.values()) {
            Coffee coffee = coffeeFactory.prepareCoffee(coffeeType);
            coffee.drink();
        }
    }
}
