package Bridge;

public class ConcreteAbstractionA implements IAbstraction{
    private Implementor implementor;

    public ConcreteAbstractionA(Implementor implementor){
        this.implementor = implementor;
    }

    @Override
    public void method1(){
        // Aqui entra la diferencia con el Adapter, se puede implementar una logica aqui
        System.out.println("Concrete Abstraction A - method 1");
        this.implementor.operationA();
    }

    @Override
    public void method2(){
        // Aqui entra la diferencia con el Adapter, se puede implementar una logica aqui
        System.out.println("Concrete Abstraction A - method 2");
        this.implementor.operationB();
    }
}
