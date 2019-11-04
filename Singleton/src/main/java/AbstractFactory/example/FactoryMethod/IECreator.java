package AbstractFactory.example.FactoryMethod;

public class IECreator extends Creator{

    @Override
    public IE navigateWeb(){
        IE nav = new IE();
        Crawler base1 = new Crawler();
        Windowz base2 = new Windowz();
        nav.setCrawler(base1);
        nav.setWindowz(base2);
        return nav;
    }
}
