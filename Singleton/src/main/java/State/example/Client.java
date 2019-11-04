package State.example;

public class Client {

    public static void main(String [] args){
        IState state = new Bloqueado();
        Context context = new Context();

        context.setState(state);
        context.request();

        state = new Desbloqueado();
        context.setState(state);
        context.request();
    }

}
