package mei.designpattern.behavioral.observer.allycontrolcenter;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return this.name;
    }

    @Override
    public void beAttacked(AllyControlCenter cc) {
        System.out.println(name + " is attacked");
        cc.notifyObserver(this.name);
    }

    @Override
    public void help() {
        System.out.println(name + " comes to help you");
    }
}
