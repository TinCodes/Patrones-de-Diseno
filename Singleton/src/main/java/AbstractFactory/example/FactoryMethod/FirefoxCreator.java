package AbstractFactory.example.FactoryMethod;

public class FirefoxCreator extends Creator{

    @Override
    public Firefox navigateWeb(){
        Firefox nav = new Firefox();
        Crawler base1 = new Crawler();
        Windowz base2 = new Windowz();
        nav.setCrawler(base1);
        nav.setWindowz(base2);
        return nav;
    }
}
