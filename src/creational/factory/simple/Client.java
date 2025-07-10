package creational.factory.simple;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("dog");
        a1.speak();
        Animal a2 = AnimalFactory.getAnimal("cat");
        a2.speak();

        List<Integer> integers = new ArrayList<>();
    }
}
