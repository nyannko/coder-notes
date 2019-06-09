package mei.designpattern.behavioral.observer.structure;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        // some code impl
        System.out.println("Observer state updated");
    }
}
