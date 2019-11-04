package Decorator;

public class Client {
    public static void main(String []args){
        Component concreteObject = new ConcreteComponent();
        concreteObject = new ConcreteDecoratorA(concreteObject);
        concreteObject = new ConcreteDecoratorB(concreteObject);

        concreteObject.operation();
    }
}
