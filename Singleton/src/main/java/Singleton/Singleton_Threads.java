package Singleton;

public class Singleton_Threads {

    private static Singleton_Threads instance = null;

    private Singleton_Threads(){
        System.out.println("Creating a draft.Singleton_Threads instance");
    }

    // ********** Notice the synchronized, memory spaces were not the same before this ******************

    public static synchronized Singleton_Threads getUniqueInstance(){
        if (instance == null)
            instance = new Singleton_Threads();

        return instance;
    }

    public void myInstance(){
        System.out.println("Using a draft.Singleton_Threads Instance");
    }

    public void destroyInstance(){
        // This forces another instantiation and uses another memory space
        instance = null;
    }

    // This way of using singleton is used when you want to use a multithreaded
    // system.
}
