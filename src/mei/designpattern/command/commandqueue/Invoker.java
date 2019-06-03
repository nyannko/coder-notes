package mei.designpattern.command.commandqueue;

public class Invoker {
    private CommandQueue commandQueue;

    public Invoker(CommandQueue cq) {
        this.commandQueue = cq;
    }

    public void setCommandQueue(CommandQueue cq) {
        this.commandQueue = cq;
    }

    public void call() {
        commandQueue.execute();
    }

}
