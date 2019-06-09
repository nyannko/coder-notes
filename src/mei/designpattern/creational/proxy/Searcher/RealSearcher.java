package mei.designpattern.creational.proxy.Searcher;

public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String uid, String keyWord) {
        System.out.println("User " + uid + " search for " + keyWord);
        return "Search results";
    }
}
