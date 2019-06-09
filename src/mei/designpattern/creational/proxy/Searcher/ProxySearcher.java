package mei.designpattern.creational.proxy.Searcher;

public class ProxySearcher implements Searcher {
    private AccessValidator av;
    private Logger lg;
    private RealSearcher rs;

    public ProxySearcher() {
        av = new AccessValidator();
        lg = new Logger();
        rs = new RealSearcher();
    }

    @Override
    public String doSearch(String uid, String keyWord) {
        if (av.validate(uid)) {
            lg.log(uid);
            return rs.doSearch(uid, keyWord);
        }
        return null;
    }
}
