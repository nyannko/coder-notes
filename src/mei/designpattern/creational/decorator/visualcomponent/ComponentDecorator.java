package mei.designpattern.creational.decorator.visualcomponent;

public class ComponentDecorator extends Component {
    private Component component;

    // aggregate component
    public ComponentDecorator(Component c) {
        this.component = c;
    }

    @Override
    public void display() {
        component.display();
    }
}
