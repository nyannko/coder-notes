package mei.designpattern.creational.bridge.structure;

public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        impl.operationImpl();
    }
}
