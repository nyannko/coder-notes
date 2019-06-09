package mei.designpattern.behavioral.command.commandqueue;

import mei.designpattern.behavioral.command.functionbutton.Command;

import java.util.ArrayList;

public class CommandQueue {
    private ArrayList<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command c) {
        commandQueue.add(c);
    }

    public void removeCommand(Command c) {
        commandQueue.remove(c);
    }

    public void execute() {
        for (Command c : commandQueue) {
            c.execute();
        }
    }
}
