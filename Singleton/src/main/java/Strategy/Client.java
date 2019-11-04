package Strategy;

public class Client {
    public static void main(String []args){
        Context context = new Context();
        context.setAtt1(9);

        context.execute();
    }
}
