package AbstractFactoryPattern;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Draw Button in Windows");
    }
}
