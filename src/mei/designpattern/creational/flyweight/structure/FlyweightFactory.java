package mei.designpattern.creational.flyweight.structure;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> pool = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (pool.containsKey(key)) {
            return pool.get(key);
        }
        // create new one
        Flyweight fw = new ConcreteFlyWeight(key);
        pool.put(key, fw);
        return fw;
    }
}
