package Singleton;

public class Singleton2 {

    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {
        System.out.println("Creating draft.Singleton");
    }

    public static Singleton2 getUniqueInstance(){
        return instance;
    }

    public void myInstance() {
        System.out.println("Using draft.Singleton");
    }

    // This way of using singleton cannot be destroyed
    // This is caused by the attribute being final
    // This singleton is used when we do not add things to the
    // new object that we are going to use throughout the code
}
