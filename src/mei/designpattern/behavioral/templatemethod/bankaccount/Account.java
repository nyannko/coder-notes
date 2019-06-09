package mei.designpattern.behavioral.templatemethod.bankaccount;

public abstract class Account {
    // concrete method
    public boolean validate(String account, String password) {
        if (account.equals("Alice") && password.equals("123"))
            return true;
        return false;
    }

    // abstract method
    public abstract void calculateInterest();

    // concrete method
    public void display() {
        System.out.println("Print interest");
    }

    // template method: main logic
    public final void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("Wrong user name or wrong password");
            return;
        }
        calculateInterest();
        display();
    }
}
