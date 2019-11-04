package Singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Creating a draft.Singleton instance");
    }

    public static Singleton getUniqueInstance(){
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

    public void myInstance(){
        System.out.println("Using a draft.Singleton Instance");
    }

    public void destroyInstance(){
        // This forces another instantiation and uses another memory space
        instance = null;
    }

    // This way of using singleton is used when you want to add
    // something to the instantiated object at sometime but not
    // as frequently. Destroying the instance, adding and creating
    // the instance again is how this singleton is meant to be used.
}
