package mei.designpattern.creational.flyweight.GoChess;

public abstract class GoChess {
    public abstract String getColor();

    public void display(Coordinates cord) {
        System.out.println(this.getColor() + " in location " + cord.getXY());
    }
}
