package mei.designpattern.creational.decorator.visualcomponent;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component c) {
        super(c);
    }

    @Override
    public void display() {
        this.setBlackBorderDecorator();
        super.display();
    }

    public void setBlackBorderDecorator() {
        System.out.println("Set black border decorator for component");
    }
}
