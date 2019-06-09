package mei.designpattern.behavioral.iterator.structure;

public class ConcreteAggergate implements Aggregate {
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
