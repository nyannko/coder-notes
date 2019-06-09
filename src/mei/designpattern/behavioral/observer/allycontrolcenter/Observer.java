package mei.designpattern.behavioral.observer.allycontrolcenter;

public interface Observer {
    public void help();

    public String getPlayerName();

    public void beAttacked(AllyControlCenter cc);

}
