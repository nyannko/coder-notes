package mei.designpattern.templatemethod.bankaccount;

public class Client {
    public static void main(String[] args) {
        Account Alice = new CurrentAccount();
        Alice.handle("Alice", "123");
    }
}
/* execution result
Interest calculation method one
Print interest
 */