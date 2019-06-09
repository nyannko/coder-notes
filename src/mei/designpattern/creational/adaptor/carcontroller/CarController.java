package mei.designpattern.creational.adaptor.carcontroller;

// role: target
public abstract class CarController {
    public void move() {
        System.out.println("This car starts to move");
    }

    public abstract void phonate();

    public abstract void twinkle();
}
