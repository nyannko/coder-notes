package mei.designpattern.structural.prototype.weeklylogdeepclone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        WeeklyLog old = new WeeklyLog();
        old.setName("mei");
        Attachment a = new Attachment();
        a.setName("mei's attachment");
        old.setAttachment(a);
        WeeklyLog clone = null;
        try {
            clone = old.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(clone == old);
        System.out.println(clone.getAttachment() == old.getAttachment());
    }
}
