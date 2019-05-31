package mei.designpattern.strategy.movieticket;

// Context class
public class MovieTicket {
    private double price;
    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        System.out.println("Ticket price: " + price);
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void calculate() {
        System.out.println(discount.calculate(price));
    }
}
