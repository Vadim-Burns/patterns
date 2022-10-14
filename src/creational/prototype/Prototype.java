package creational.prototype;

public interface Prototype<T extends Prototype> {
    T clone();
}
