package mei.designpattern.behavioral.iterator.abstractobjectlist;

import java.util.ArrayList;

public class ProductIterator implements AbstractIterator {
    private ArrayList<Object> list;
    private int start;
    private int end;

    public ProductIterator(AbstractObjectList list) {
        this.list = list.getObjectList();
        this.start = 0;
        this.end = this.list.size() - 1;
    }

    @Override
    public void next() {
        if (start < list.size()) {
            start++;
        }
    }

    @Override
    public boolean isLast() {
        return start == list.size();
    }

    @Override
    public void previous() {
        if (end > -1) {
            end--;
        }
    }

    @Override
    public boolean isFirst() {
        return end == -1;
    }

    @Override
    public Object getNextObject() {
        return list.get(start);
    }

    @Override
    public Object getPreviousObject() {
        return list.get(end);
    }
}
