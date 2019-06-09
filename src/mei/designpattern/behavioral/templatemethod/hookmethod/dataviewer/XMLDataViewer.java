package mei.designpattern.behavioral.templatemethod.hookmethod.dataviewer;

public class XMLDataViewer extends DataViewer {
    @Override
    public void getData() {
        System.out.println("Get XML data");
    }

    @Override
    public void displayData() {
        System.out.println("Display data with bar chart");
    }

    public boolean isNotXMLData() {
        return false;
    }
}
