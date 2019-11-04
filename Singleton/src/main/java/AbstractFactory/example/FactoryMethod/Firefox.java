package AbstractFactory.example.FactoryMethod;

public class Firefox implements IBrowser{
    Crawler crawler;
    Windowz windowz;

    public Crawler getCrawler() {
        return crawler;
    }

    public void setCrawler(Crawler crawler) {
        this.crawler = crawler;
    }

    public Windowz getWindowz() {
        return windowz;
    }

    public void setWindowz(Windowz windowz) {
        this.windowz = windowz;
    }

    @Override
    public void create(){

    }
}
