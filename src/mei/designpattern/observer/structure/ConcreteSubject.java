package mei.designpattern.observer.structure;

public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
