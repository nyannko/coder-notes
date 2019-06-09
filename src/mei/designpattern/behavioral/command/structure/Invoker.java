package mei.designpattern.behavioral.command.structure;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    // set new command
    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

}
