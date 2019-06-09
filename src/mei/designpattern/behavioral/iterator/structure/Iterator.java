package mei.designpattern.behavioral.iterator.structure;

public interface Iterator {
    public void first();

    public void next();

    public boolean hasNext();

    public Object currItem();
}
