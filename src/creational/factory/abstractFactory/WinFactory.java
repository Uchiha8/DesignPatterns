package creational.factory.abstractFactory;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextField createTextFiled() {
        return new WinTextField();
    }
}
