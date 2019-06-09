package mei.designpattern.behavioral.templatemethod.hookmethod.dataviewer;

public class Client {
    public static void main(String[] args) {
        DataViewer dv = new XMLDataViewer();
        dv.process();
        DataViewer dv2 = new JSONDataViewer();
        dv2.process();
    }
}
/* execution result
Get XML data
Display data with bar chart
Get JSON data
Convert data to XML
Display data with pie chart
 */
