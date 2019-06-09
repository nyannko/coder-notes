package mei.designpattern.behavioral.strategy.movieticket;

public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("Get children discount");
        if (price > 20)
            return price - 10;
        else
            return price;
    }
}
