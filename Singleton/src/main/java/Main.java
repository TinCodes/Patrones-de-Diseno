import Singleton.Singleton;
import Singleton.Singleton2;
import Singleton.Singleton_Threads;

public class Main {
    public static void main(String []args){

        // All these instances use the same memory space
        Singleton.getUniqueInstance().myInstance();
        Singleton.getUniqueInstance().myInstance();
        Singleton.getUniqueInstance().myInstance();
        Singleton.getUniqueInstance().myInstance();
        Singleton.getUniqueInstance().myInstance();

        // The same goes for the other way of making a singleton class
        Singleton2.getUniqueInstance().myInstance();
        Singleton2.getUniqueInstance().myInstance();
        Singleton2.getUniqueInstance().myInstance();

        // This Singleton can be destroyed
        Singleton first = Singleton.getUniqueInstance();
        Singleton second = Singleton.getUniqueInstance();

        Singleton2 one = Singleton2.getUniqueInstance();
        Singleton2 two = Singleton2.getUniqueInstance();


        // Upon creating a new instance of another class that does not use singleton,
        // the objects created use different memory spaces
        Lol test = new Lol();
        Lol test1 = new Lol();

        // Proof
            // Singleton 1
        System.out.println("Memory: " + first.hashCode());
        System.out.println("Memory: " + second.hashCode());
        System.out.println("Memory: " + Singleton.getUniqueInstance().hashCode());
            // Lol
        System.out.println("Memory: " + test.hashCode());
        System.out.println("Memory: " + test1.hashCode());
            // Singleton 2
        System.out.println("Memory: " + one.hashCode());
        System.out.println("Memory: " + two.hashCode());

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton_Threads a = Singleton_Threads.getUniqueInstance();
                System.out.println("Thread 1 Memory: " + a.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton_Threads b = Singleton_Threads.getUniqueInstance();
                System.out.println("Thread 2 Memory: " + b.hashCode());
            }
        });

        thread1.start();
        thread2.start();

        // As expected, Singleton must not be able to be cloned
        // Singleton3 notCloneableObject = (Singleton3) Singleton3.getUniqueInstance().clone();

    }
}
