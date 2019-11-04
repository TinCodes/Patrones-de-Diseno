package ChainOfResponsibility.exercise2;

public class Supervisor implements IHandler{
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
        if (((amount*100)/prestamo) > 50 && ((amount*100)/prestamo) < 100){
            System.out.println("Supervisor: Gracias por su pago!");
            nuevosPrestamos();
        } else {
            next.criteriaHandler(amount);
        }
    }

    public void nuevosPrestamos(){
        System.out.println("Desea realizar algun nuevo prestamo con nosotros?");
    }

}
