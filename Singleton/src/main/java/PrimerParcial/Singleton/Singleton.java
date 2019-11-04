package PrimerParcial.Singleton;

public class Singleton implements Cloneable {
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Creating a draft.Singleton_Threads instance");
    }

    public static synchronized Singleton getUniqueInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }

    public void destroyInstance() {
        // This forces another instantiation and uses another memory space
        instance = null;
    }

    public static void pagar(String hora, int cant) {
        System.out.println("Pago realizado a hora: " + hora);
        System.out.println("Cantidad: " + cant);
    }
}

