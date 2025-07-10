package creational.factory.simple;

public class AnimalFactory {
    public  static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) return new Dog();
        if ("cat".equalsIgnoreCase(type)) return new Cat();
        throw new IllegalArgumentException("Unknown type");
    }
}
