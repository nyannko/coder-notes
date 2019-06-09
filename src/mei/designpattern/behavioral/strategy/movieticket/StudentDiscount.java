package mei.designpattern.behavioral.strategy.movieticket;

public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("Get student discount");
        return 0.8 * price;
    }
}
