package mei.designpattern.behavioral.observer.allycontrolcenter;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    @Override
    public void notifyObserver(String name) {
        for (Observer o : observers) {
            if (!o.getPlayerName().equals(name))
                o.help();
        }
    }
}
