package mei.designpattern.strategy.structure;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy s) {
        this.strategy = s;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
