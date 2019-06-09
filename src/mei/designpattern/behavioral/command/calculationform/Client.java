package mei.designpattern.behavioral.command.calculationform;

public class Client {
    public static void main(String[] args) {
        CalculationForm cf = new CalculationForm();
        AbstractCommand ac = new AddCommand();
        cf.setCommand(ac);
        cf.compute(10);
        cf.compute(30);
        cf.undo();
    }
}
