package mei.designpattern.structural.prototype.weeklylog;

public class Client {
    public static void main(String[] args) {
        WeeklyLog old = new WeeklyLog();
        old.setName("mei");
        Attachment a = new Attachment();
        a.setName("mei's attachment");
        old.setAttachment(a);
        WeeklyLog clone = old.clone();
        System.out.println(clone == old);
        // still point to the same address
        // shallow clone
        System.out.println(clone.getAttachment() == old.getAttachment());
    }

}
