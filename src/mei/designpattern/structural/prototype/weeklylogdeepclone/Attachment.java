package mei.designpattern.structural.prototype.weeklylogdeepclone;

import java.io.Serializable;

public class Attachment implements Serializable {
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
