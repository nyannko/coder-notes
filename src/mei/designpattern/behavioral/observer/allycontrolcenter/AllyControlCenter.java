package mei.designpattern.behavioral.observer.allycontrolcenter;

import java.util.ArrayList;

public abstract class AllyControlCenter {
    private String centerName;
    protected ArrayList<Observer> observers = new ArrayList<>();

    public String getCenterName() {
        return centerName;
    }

    public void join(Observer o) {
        observers.add(o);
    }

    public void quit(Observer o) {
        observers.remove(o);
    }

    public abstract void notifyObserver(String name);

}
