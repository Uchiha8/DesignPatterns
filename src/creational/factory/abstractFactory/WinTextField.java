package creational.factory.abstractFactory;

public class WinTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Windows-style text field");
    }
}
