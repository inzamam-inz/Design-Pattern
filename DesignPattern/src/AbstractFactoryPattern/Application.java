package AbstractFactoryPattern;

public class Application {
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void drawButton() {
        factory.createButton();
    }

    public void drawCheckBox() {
        factory.createCheckBox();
    }
}
