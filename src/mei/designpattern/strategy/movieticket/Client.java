package mei.designpattern.strategy.movieticket;

public class Client {
    public static void main(String[] args) {
        Discount discount = new StudentDiscount();
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(100);
        ticket.setDiscount(discount);
        ticket.calculate();
    }
}
/* execution result
Ticket price: 100.0
Get student discount
80.0
 */
