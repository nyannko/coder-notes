package mei.designpattern.behavioral.templatemethod.hookmethod.dataviewer;

public class JSONDataViewer extends DataViewer {
    @Override
    public void getData() {
        System.out.println("Get JSON data");
    }

    @Override
    public void displayData() {
        System.out.println("Display data with pie chart");
    }

}
