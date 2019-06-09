package mei.designpattern.behavioral.observer.allycontrolcenter;

public class Client {
    public static void main(String[] args) {
        AllyControlCenter cc = new ConcreteAllyControlCenter();
        Observer john = new Player("John");
        Observer alice = new Player("Alice");
        Observer bob = new Player("Bob");
        cc.join(john);
        cc.join(alice);
        cc.join(bob);
        john.beAttacked(cc);
    }
}
/* execution result
John is attacked
Alice comes to help you
Bob comes to help you
 */

