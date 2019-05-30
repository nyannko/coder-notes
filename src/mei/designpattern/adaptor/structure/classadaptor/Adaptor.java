package mei.designpattern.adaptor.structure.classadaptor;

public class Adaptor extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
