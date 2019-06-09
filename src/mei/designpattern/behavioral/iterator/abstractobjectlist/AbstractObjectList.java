package mei.designpattern.behavioral.iterator.abstractobjectlist;

import java.util.ArrayList;

public abstract class AbstractObjectList {
    protected ArrayList<Object> list = new ArrayList<>();

    // basic operations for data
    public AbstractObjectList(ArrayList<Object> list) {
        this.list = list;
    }

    public void addObject(Object obj) {
        this.list.add(obj);
    }

    public void removeObject(Object obj) {
        this.list.remove(obj);
    }

    public ArrayList getObjectList() {
        return this.list;
    }

    // iterator for loop data
    public abstract AbstractIterator createIterator();
}
