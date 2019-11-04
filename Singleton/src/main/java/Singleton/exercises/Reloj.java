package Singleton.exercises;

public class Reloj {

    private static Reloj relojInstance = null;

    private Reloj(){

    }

    public static Reloj getUniqueInstance(){
        if (relojInstance == null)
            relojInstance = new Reloj();

        return relojInstance;
    }


}
