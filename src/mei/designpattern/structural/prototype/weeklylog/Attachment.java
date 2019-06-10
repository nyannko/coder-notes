package mei.designpattern.structural.prototype.weeklylog;

public class Attachment {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("Download attachment for " + this.name);
    }
}
