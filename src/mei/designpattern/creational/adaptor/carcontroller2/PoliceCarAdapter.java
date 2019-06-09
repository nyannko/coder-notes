package mei.designpattern.creational.adaptor.carcontroller2;

import mei.designpattern.creational.adaptor.carcontroller.PoliceLight;

public class PoliceCarAdapter extends PoliceLight implements CarController {
    @Override
    public void move() {
        System.out.println("This car starts to move");
        super.alarmLamp();
    }
}
