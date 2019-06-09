package mei.designpattern.creational.proxy.structure;

public class Proxy extends Subject{
    private RealSubject realSubject = new RealSubject();

    public void preRequest() {
        // some code impl
    }

    public void request() {
        preRequest();
        realSubject.request(); // call request in real subject
        postRequest();
    }

    public void postRequest() {
        // some code impl
    }

}
