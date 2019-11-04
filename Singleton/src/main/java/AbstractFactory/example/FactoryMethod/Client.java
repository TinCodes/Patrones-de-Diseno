package AbstractFactory.example.FactoryMethod;

public class Client {

    public static void main(String []args){
        Firefox firefox = new FirefoxCreator().navigateWeb();
        Chrome chrome = new ChromeCreator().navigateWeb();
        IE ie = new IECreator().navigateWeb();
    }


}
