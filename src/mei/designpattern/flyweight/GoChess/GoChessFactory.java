package mei.designpattern.flyweight.GoChess;

import java.util.HashMap;

public class GoChessFactory {
    private static GoChessFactory instance = null;
    private static HashMap<String, GoChess> pool;

    private GoChessFactory() {
        pool = new HashMap<>();
    }

    // singleton
    public static GoChessFactory getFactory() {
        if (instance == null)
            instance = new GoChessFactory();
        return instance;
    }

    // save chess to factory
    public void putChess(String color) {
        if (pool.containsKey(color)) return;
        if (color.equals("b"))
            pool.put(color, new BlackChess());
        else if (color.equals("w"))
            pool.put(color, new WhiteChess());
        else
            System.out.println("Unsupported");
    }

    // get chess by color
    public GoChess getChess(String color) {
        if (pool.containsKey(color))
            return pool.get(color);
        return null;
    }

}
