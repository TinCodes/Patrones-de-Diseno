package ChainOfResponsibility;

public class Organizer implements IHandler {

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
        ConcreteHandler handler1 = new ConcreteHandler();
        this.setNext(handler1);

        ConcreteHandler2 handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        ConcreteHandler3 handler3 = new ConcreteHandler3();
        handler2.setNext(handler3);

        next.criteriaHandler(amount);
    }


}
