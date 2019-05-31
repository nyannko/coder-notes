package mei.designpattern.observer.structure;

public class Client {
    public static void main(String[] args) {
        Subject sb =new ConcreteSubject();
        Observer o = new ConcreteObserver();
        sb.attach(o);
        sb.notifyObserver(); // Observer state updated
    }
}
