package Visitor;

public class Client {
    public static void main(String [] args){
        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();

        ConcreteVisitor visitor = new ConcreteVisitor();

        System.out.println("Result A: " + concreteElementA.accept(visitor));
        System.out.println("Result B: " + concreteElementB.accept(visitor));

    }
}
