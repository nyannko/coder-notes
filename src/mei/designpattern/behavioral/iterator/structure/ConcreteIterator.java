package mei.designpattern.behavioral.iterator.structure;

public class ConcreteIterator implements Iterator {
    private Aggregate aggregate;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {

    }

    @Override
    public void next() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object currItem() {
        return null;
    }
}
