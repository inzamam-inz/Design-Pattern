package StrategyPattern;

public class StrategySubtract implements Stategy {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
