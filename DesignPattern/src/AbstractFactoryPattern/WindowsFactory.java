package AbstractFactoryPattern;

public class WindowsFactory implements GUIFactory {
    @Override
    public void createButton() {
        System.out.println("Create Button Under Windows Factory");
    }

    @Override
    public void createCheckBox() {
        System.out.println("Create Check Box Under Windows Factory");
    }
}
