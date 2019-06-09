package mei.designpattern.behavioral.templatemethod.bankaccount;

public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("Interest calculation method two");
    }
}
