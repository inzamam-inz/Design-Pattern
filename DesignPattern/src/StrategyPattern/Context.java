package StrategyPattern;

public class Context {
    private Stategy stategy;

    public Context(Stategy stategy) {
        this.stategy = stategy;
    }

    public int executeStrategy(int a, int b) {
        return stategy.execute(a, b);
    }
}
