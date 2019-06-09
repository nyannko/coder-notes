package mei.designpattern.structural.prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        System.out.println("Clone two obj:");
        for (int i = 0; i < 2; i++) {
            prototype.setAttr("attr" + i);
            System.out.println(prototype.clone());
        }
    }
}
