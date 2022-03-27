package SingleTonPattern;

public class ThePresident {
    public static void main(String args[]) {
        President presidentOne = President.getInstance();
        President presidentTwo = President.getInstance();
    }
}