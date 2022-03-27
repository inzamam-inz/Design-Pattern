package StrategyPattern;

public class StrategyAdd implements Stategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
