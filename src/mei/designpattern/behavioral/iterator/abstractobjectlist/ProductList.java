package mei.designpattern.behavioral.iterator.abstractobjectlist;

import java.util.ArrayList;

public class ProductList extends AbstractObjectList {
    private ProductIterator iterator;

    public ProductList(ArrayList<Object> list) {
        super(list);
    }

    @Override
    public AbstractIterator createIterator() {
       return new ProductIterator(this);
    }
}
