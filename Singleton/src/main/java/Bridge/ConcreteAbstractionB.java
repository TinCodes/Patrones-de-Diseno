package Bridge;

public class ConcreteAbstractionB implements IAbstraction{
    private Implementor implementor;

    public ConcreteAbstractionB(Implementor implementor){
        this.implementor = implementor;
    }

    @Override
    public void method1(){
        // Aqui entra la diferencia con el Adapter, se puede implementar una logica aqui
        System.out.println("Concrete Abstraction B - method 1");
        this.implementor.operationA();
    }

    @Override
    public void method2(){
        // Aqui entra la diferencia con el Adapter, se puede implementar una logica aqui
        System.out.println("Concrete Abstraction B - method 2");
        this.implementor.operationB();
    }
}
