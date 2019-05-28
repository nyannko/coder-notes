package mei.designpattern.templatemethod.structure;

public abstract class AbstractClass {
    // abstract method
    public abstract void primitiveOperation1();

    // concrete method
    public void primitiveOperation2() {
        // some code impl
    }

    // hook method
    public void primitiveOperation3() {
        // empty or default
    }

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
    }
}
