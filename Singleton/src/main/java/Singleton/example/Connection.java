package Singleton.example;

public class Connection {

    private static Connection connInstance = null;

    private Connection(){
        //System.out.println("Connection with BDGENERICNAME successful");
    }

    public static synchronized Connection getInstance(){
        if (connInstance == null)
            connInstance = new Connection();

        return connInstance;
    }

    public void upload(String value){
        System.out.println("Uploading action: " + value);
    }
}
