package Singleton.example;

public class Logger {

    private static Logger myInstance = null;
    private String filename;

    private Logger(){
        filename = "/tmp/log.txt";
        //System.out.println("Instantiating Singleton...");
    }

    public static synchronized Logger getInstance(){
        if (myInstance == null)
            myInstance = new Logger();

        return myInstance;
    }

    /**
     *
     * @param level INFO, WARNING, ERROR
     * @param value
     */

    public void writeLog(String level, String value){
        System.out.println("FILE: " + filename + " - " + level + "\t>\t" + value);
    }

}

