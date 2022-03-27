package AbstractFactoryPattern;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Draw CheckBox in Windows");
    }
}
