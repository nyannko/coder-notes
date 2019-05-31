package mei.designpattern.observer.allycontrolcenter;

public interface Observer {
    public void help();

    public String getPlayerName();

    public void beAttacked(AllyControlCenter cc);

}
