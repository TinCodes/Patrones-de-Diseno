package ChainOfResponsibility;

public class ConcreteHandler2 implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler){
        next = handler;
    }

    @Override
    public IHandler next(){
        return next;
    }

    @Override
    public void criteriaHandler(int amount){
        if (amount >= 100 && amount < 200){
            System.out.println("Tarea atendida por ConcreteHandler2");
        } else {
            next.criteriaHandler(amount);
        }
    }

}
