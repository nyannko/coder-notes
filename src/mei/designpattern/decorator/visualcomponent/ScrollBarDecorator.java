package mei.designpattern.decorator.visualcomponent;

public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component c) {
        super(c);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("Set scroll bar for component" );
    }

}
