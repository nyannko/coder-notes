package mei.designpattern.creational.composite.structure;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {
        // recursion
        for (Component c : list) {
            c.operation();
        }
    }
}
