package creational.factory.abstractFactory;

public class Application {
    private Button button;
    private TextField textField;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.textField = factory.createTextFiled();
    }

    public void renderUI() {
        button.render();
        textField.render();
    }
}
