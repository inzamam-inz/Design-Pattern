package StrategyPattern;

public class StrategyMultiply implements Stategy {

    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
