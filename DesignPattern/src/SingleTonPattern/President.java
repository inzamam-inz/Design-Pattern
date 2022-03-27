package SingleTonPattern;

public class President {
    static President instance;

    private President() {
        System.out.println("President Created");
    }

    public static President getInstance() {
        if (instance == null) {
            instance = new President();
        }

        return instance;
    }
}
