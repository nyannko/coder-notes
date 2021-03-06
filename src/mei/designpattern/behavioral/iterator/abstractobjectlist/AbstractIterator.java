package mei.designpattern.behavioral.iterator.abstractobjectlist;

public interface AbstractIterator {
    public void next();
    public boolean isLast();
    public void previous();
    public boolean isFirst();
    public Object getNextObject();
    public Object getPreviousObject();
}
