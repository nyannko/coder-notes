package mei.designpattern.behavioral.strategy.movieticket;

public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("Get VIP discount");
        return 0.5 * price;
    }
}
