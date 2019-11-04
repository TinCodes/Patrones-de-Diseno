package SegundoParcial.State;

public class Client {

    public static void main(String [] args){
        IState state = new Apagado();
        Computadora context = new Computadora();
        context.setState(state);
        context.request();

        state = new Prendido();
        context.setState(state);
        context.request();

        state = new Reiniciar();
        context.setState(state);
        context.request();
    }

}
