package mei.designpattern.behavioral.strategy.structure;

public class Client {
    public static void main(String[] args) {
        Strategy sa = new ConcreteStrategyA();
        Context context = new Context();
        context.setStrategy(sa);
        context.algorithm();
    }
}
