package PrimerParcial.Singleton;

public class Client {
    public static void main(String []args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton a = Singleton.getUniqueInstance();
                a.pagar("14:45", 1000);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton b = Singleton.getUniqueInstance();
                b.pagar("14:45", 2000);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton c = Singleton.getUniqueInstance();
                c.pagar("1:25", 7000000);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
