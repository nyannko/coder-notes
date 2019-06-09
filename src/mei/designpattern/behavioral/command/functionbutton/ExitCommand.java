package mei.designpattern.behavioral.command.functionbutton;

public class ExitCommand extends Command {
    private SystemExitClass seObj;

    public ExitCommand() {
        seObj = new SystemExitClass();
    }

    @Override
    public void execute() {
        seObj.exit();
    }
}
