package mei.designpattern.creational.adaptor.carcontroller;

public class Client {
    public static void main(String[] args) {
        CarController controller = new PoliceCarAdapter();
        controller.move();
        controller.phonate();
        controller.twinkle();
    }
}
/* execution result
carcontroller starts to move
biubiubiu
twinkle
 */
