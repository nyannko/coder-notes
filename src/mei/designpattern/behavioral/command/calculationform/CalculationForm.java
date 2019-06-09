package mei.designpattern.behavioral.command.calculationform;

public class CalculationForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int i = command.execute(value);
        System.out.println(i);
    }

    public void undo() {
        int i = command.undo();
        System.out.println(i);
    }
}
