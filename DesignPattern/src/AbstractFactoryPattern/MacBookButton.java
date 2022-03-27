package AbstractFactoryPattern;

public class MacBookButton implements Button {
    @Override
    public void paint() {
        System.out.println("Draw Button in Mac Book");
    }
}
