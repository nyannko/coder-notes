package mei.designpattern.structural.prototype.prototypemanager;

import mei.designpattern.structural.prototype.structure.ConcretePrototype;
import mei.designpattern.structural.prototype.structure.Prototype;

import java.util.HashMap;

public class PrototypeManager {
    private HashMap<String, Prototype> prototypeMap = new HashMap<>();
    public PrototypeManager() {
        prototypeMap.put("A", new ConcretePrototype());
    }

    public void add(String key, Prototype prototype) {
        prototypeMap.put(key, prototype);
    }

    public Prototype get(String key) {
        return prototypeMap.get(key).clone();
    }
}
