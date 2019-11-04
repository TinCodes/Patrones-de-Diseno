package Proxy;

public class Client {
    public static void main(String []args){
        // create proxy
        ISubject proxy = new Proxy("blocked or not filter");
        proxy.request();
    }

}
