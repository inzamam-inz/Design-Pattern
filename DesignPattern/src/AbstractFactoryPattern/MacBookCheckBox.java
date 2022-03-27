package AbstractFactoryPattern;

public class MacBookCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Draw CheckBox in Mac Book");
    }
}
