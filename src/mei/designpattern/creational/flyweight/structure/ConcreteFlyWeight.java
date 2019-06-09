package mei.designpattern.creational.flyweight.structure;

public class ConcreteFlyWeight extends Flyweight {
    private String intrinsicState;

    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        // some code impl
    }
}
