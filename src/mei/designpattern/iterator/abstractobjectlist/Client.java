package mei.designpattern.iterator.abstractobjectlist;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        AbstractObjectList list;
        AbstractIterator iterator;
        ArrayList<Object> input = new ArrayList<>();
        for (int i = 0; i < 5; i++) input.add(i);

        // create a new product list
        list = new ProductList(input);
        // create a new product iterator
        iterator = new ProductIterator(list);

        while (!iterator.isLast()) {
            System.out.print(iterator.getNextObject());
            iterator.next();
        }
        System.out.println();
        while (!iterator.isFirst()) {
            System.out.print(iterator.getPreviousObject());
            iterator.previous();
        }
    }
}
/* execution result
01234
43210
 */
