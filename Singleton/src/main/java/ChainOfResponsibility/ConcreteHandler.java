package ChainOfResponsibility;

public class ConcreteHandler implements IHandler{
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
        if (amount < 100){
            System.out.println("Tarea atendida por ConcreteHandler1");
        } else {
            next.criteriaHandler(amount);
        }
    }

}
