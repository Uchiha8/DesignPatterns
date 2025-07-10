package creational.factory.abstractFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            factory = new MacFactory();
        }else {
            factory = new WinFactory();
        }


        Application app = new Application(factory);
        app.renderUI();
    }
}
