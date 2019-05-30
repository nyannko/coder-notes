package mei.designpattern.flyweight.GoChess;

public class Client {
    public static void main(String[] args) {
        // singleton
        GoChessFactory factory = GoChessFactory.getFactory();
        factory.putChess("b");
        factory.putChess("w");

        GoChess c1 = factory.getChess("b");
        GoChess c2 = factory.getChess("b");

        c1.display(new Coordinates(1, 2));
        c2.display(new Coordinates(3, 5));
        System.out.println(c1 == c2); // true
    }
}
