package mei.designpattern.creational.adaptor.carcontroller2;

public class Client {
    public static void main(String[] args) {
        CarController controller = new PoliceCarAdapter();
        controller.move();
    }
}
/* execution result
This car starts to move
twinkle
 */
