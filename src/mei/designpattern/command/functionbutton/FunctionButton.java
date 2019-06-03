package mei.designpattern.command.functionbutton;

public class FunctionButton {
    private Command command;

    public FunctionButton(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
