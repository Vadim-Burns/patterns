package creational.singleton;

import java.util.concurrent.ThreadLocalRandom;

public class Singleton {
    private static Singleton instance = null;

    private final int id;

    private Singleton() {
        id = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Creating singleton " + id);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        System.out.println("Getting singleton " + instance.getId());
        return instance;
    }

    private int getId() {
        return id;
    }
}
