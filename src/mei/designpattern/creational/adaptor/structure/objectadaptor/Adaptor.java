package mei.designpattern.creational.adaptor.structure.objectadaptor;

public class Adaptor extends Target {
    private Adaptee adaptee;

    public Adaptor() {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
