package mei.designpattern.behavioral.command.functionbutton;

public class HelpCommand extends Command {
    private DisplayHelpClass hcObj;

    public HelpCommand() {
        hcObj = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        hcObj.display();
    }
}
