package mei.designpattern.command.functionbutton;

public class Client {
    public static void main(String[] args) {
        Command c1 = new HelpCommand();
        Command c2 = new ExitCommand();
        FunctionButton fb = new FunctionButton(c1);
        fb.click();
        fb = new FunctionButton(c2);
        fb.click();
    }
}
/* execution result
Show help doc
Exit system
 */
