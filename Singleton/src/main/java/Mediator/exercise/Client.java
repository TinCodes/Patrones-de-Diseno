package Mediator.exercise;

public class Client {

    public static void main(String []args){
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteCoder0 coder0 = new ConcreteCoder0(mediator);
        ConcreteCoder1 coder1 = new ConcreteCoder1(mediator);
        ConcreteCoder2 coder2 = new ConcreteCoder2(mediator);

        mediator.setCoder(coder0);
        mediator.setCoder(coder1);
        mediator.setCoder(coder2);

        coder0.send("\n0: Code not working on login");
        coder1.send("\n1: Pushed the final version of the website");
        coder2.send("\n2: My computer crashed");
        coder1.sendTo("\n1: Restart it, then", 2);
        coder0.sendTo("\n2: It's burning", 1);

    }

}
