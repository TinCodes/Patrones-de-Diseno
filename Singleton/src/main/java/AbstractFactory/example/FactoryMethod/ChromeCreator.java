package AbstractFactory.example.FactoryMethod;

public class ChromeCreator extends Creator {

    @Override
    public Chrome navigateWeb(){
        Chrome nav = new Chrome();
        Crawler base1 = new Crawler();
        Windowz base2 = new Windowz();
        nav.setCrawler(base1);
        nav.setWindowz(base2);
        return nav;
    }
}
