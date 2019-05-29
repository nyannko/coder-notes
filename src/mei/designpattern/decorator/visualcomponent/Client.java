package mei.designpattern.decorator.visualcomponent;

import mei.designpattern.decorator.structure.ConcreteDecorator;
import mei.designpattern.templatemethod.structure.ConcreteClass;

public class Client {
    public static void main(String[] args) {
        transparent();
        System.out.println();
        semiTransparent();
    }

    public static void transparent() {
        Component window = new Window();
        Component bd = new BlackBorderDecorator(window);
        // double decoration
        Component sd = new ScrollBarDecorator(bd);
        sd.display();
        // sd.setBlackBorderDecorator()
    }

    public static void semiTransparent() {
        Component window = new Window();
        BlackBorderDecorator sb = new BlackBorderDecorator(window);
        ScrollBarDecorator sd = new ScrollBarDecorator(sb);
        // cannot find this method
        //sd.setBlackBorderDecorator();
        sd.display();
    }
}
/* execution result
Set black border decorator for component
Display window

Set scroll bar for component
Set black border decorator for component
Display window
 */
