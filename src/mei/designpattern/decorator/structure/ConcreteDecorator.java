package mei.designpattern.decorator.structure;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component c) {
        super(c);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    public void addedBehavior() {
        // some code impl, public or private
    }
}
