package mei.designpattern.proxy.Searcher;

public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        searcher.doSearch("1", "random word");
    }
}
/* execution result
Valid login
Start logging for user 1
User 1 search for random word
 */
