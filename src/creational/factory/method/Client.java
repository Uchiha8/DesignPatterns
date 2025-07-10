package creational.factory.method;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal animal = factory.createAnimal();
        animal.speak();
    }
}
