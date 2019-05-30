package mei.designpattern.flyweight.GoChess;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        return "(" + this.x + "," + this.y + ")";
    }

}
