package mei.designpattern.templatemethod.bankaccount;

public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("Interest calculation method one");
    }
}
