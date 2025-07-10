package creational.factory.abstractFactory;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Mac-style button");
    }
}
