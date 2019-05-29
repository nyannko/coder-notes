package mei.designpattern.facade.structure;

public class Facade {
    private SubsystemA sa = new SubsystemA();
    private SubsystemB sb = new SubsystemB();
    private SubsystemC sc = new SubsystemC();

    public void method() {
        System.out.println("Call methods in Facade");
        sa.methodA();
        sb.methodB();
        sc.methodC();
    }
}
