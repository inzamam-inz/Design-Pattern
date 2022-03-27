package AbstractFactoryPattern;

public class LinuxFactory implements GUIFactory {
    @Override
    public void createButton() {
        System.out.println("Create Button Under Mac Book Factory");
    }

    @Override
    public void createCheckBox() {
        System.out.println("Create Check Box Under Mac Book Factory");
    }
}
