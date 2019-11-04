package Command;

public class Client {

    public static void main(String [] args){
        Receiver receiver = new Receiver();

        ConcreteCommand1 concreteCommand1 = new ConcreteCommand1(receiver);
        ConcreteCommand2 concreteCommand2 = new ConcreteCommand2(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(concreteCommand1);
        invoker.setCommand(concreteCommand2);

        invoker.runCommands();
    }
}
