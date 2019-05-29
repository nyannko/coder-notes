package mei.designpattern.decorator.structure;

public class Decorator extends Component {
    private Component component;

    public Decorator(Component c) {
        this.component = c;
    }

    @Override
    public void operation() {
        component.operation();
    }

}
