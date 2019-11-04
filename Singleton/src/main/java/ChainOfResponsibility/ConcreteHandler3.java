package ChainOfResponsibility;

public class ConcreteHandler3 implements IHandler{
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
        if (amount >= 300 && amount < 300){
            System.out.println("Tarea atendida por ConcreteHandler3");
        } else {
            next.criteriaHandler(amount);
        }
    }

}
