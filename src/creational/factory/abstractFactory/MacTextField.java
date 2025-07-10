package creational.factory.abstractFactory;

public class MacTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Mac-style text field");
    }
}
