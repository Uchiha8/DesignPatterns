package creational.factory.abstractFactory;

public class WinButton implements Button{
    @Override
    public void render() {
        System.out.println("Windows-style button");
    }
}
