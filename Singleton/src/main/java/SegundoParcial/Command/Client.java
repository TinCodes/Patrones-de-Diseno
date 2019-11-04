package SegundoParcial.Command;

public class Client {

    public static void main(String [] args){
        Receiver receiver = new Receiver();

        Disparar com1 = new Disparar(receiver);
        Defensa com2 = new Defensa(receiver);
        Atacar com3 = new Atacar(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(com1);
        invoker.setCommand(com3);
        invoker.setCommand(com2);
        invoker.setCommand(com1);

        System.out.println();
        invoker.runCommands();
    }
}
