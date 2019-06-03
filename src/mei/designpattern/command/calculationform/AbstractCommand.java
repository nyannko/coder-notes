package mei.designpattern.command.calculationform;

public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
