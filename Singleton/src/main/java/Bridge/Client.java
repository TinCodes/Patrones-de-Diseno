package Bridge;

public class Client {
    public static void main(String []args){
        ImplementadorA implementadorA = new ImplementadorA();
        ConcreteAbstractionA concreteAbstractionA = new ConcreteAbstractionA(implementadorA);
        concreteAbstractionA.method1();
        concreteAbstractionA.method2();
    }
}
