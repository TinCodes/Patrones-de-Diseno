package Proxy.exercise;

public class Client {
    public static void main(String []args){
        // create proxy
        ISubject proxy = new Proxy("Bolivianos");
        proxy.depositar(100);
        proxy.retirar(200);

        ISubject proxy1 = new Proxy("Euros");
        proxy1.retirar(100);
        proxy1.depositar(1000);
    }

}
