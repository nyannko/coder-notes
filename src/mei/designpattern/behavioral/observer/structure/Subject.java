package mei.designpattern.behavioral.observer.structure;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public abstract void notifyObserver();
}
