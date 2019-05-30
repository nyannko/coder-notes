package mei.designpattern.proxy.Searcher;

public class AccessValidator {
    public boolean validate(String uid) {
        if (uid.equals("1")) {
            System.out.println("Valid login");
            return true;
        }
        return false;
    }
}
