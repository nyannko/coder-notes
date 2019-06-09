package mei.designpattern.behavioral.command.calculationform;

public class Adder {
    private int sum = 0;

    public int add(int value) {
        sum += value;
        return sum;
    }
}
