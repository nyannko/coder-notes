package mei.designpattern.behavioral.templatemethod.hookmethod.dataviewer;

public abstract class DataViewer {
    // abstract method
    public abstract void getData();

    // concrete method
    public void convertData() {
        System.out.println("Convert data to XML");
    }

    // abstract method
    public abstract void displayData();

    // hook method
    public boolean isNotXMLData() {
        return true;
    }

    // template method: main logic
    public final void process() {
        getData();
        if (isNotXMLData())
            convertData();
        displayData();
    }
}
