package mei.designpattern.creational.adaptor.carcontroller;

public class PoliceCarAdapter extends CarController {
    private PoliceSound sound;
    private PoliceLight light;

    public PoliceCarAdapter() {
        sound = new PoliceSound();
        light = new PoliceLight();
    }

    @Override
    public void phonate() {
        sound.alarmSound();
    }

    @Override
    public void twinkle() {
        light.alarmLamp();
    }
}
