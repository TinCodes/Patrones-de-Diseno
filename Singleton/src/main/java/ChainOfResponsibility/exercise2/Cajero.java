package ChainOfResponsibility.exercise2;

public class Cajero implements IHandler{
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
        if ( ((amount*100)/prestamo) < 25){
            System.out.println("Cajero: Gracias por el pago!");
        } else {
            next.criteriaHandler(amount);
        }
    }

}
