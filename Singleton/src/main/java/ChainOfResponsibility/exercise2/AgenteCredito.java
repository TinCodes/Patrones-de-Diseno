package ChainOfResponsibility.exercise2;

public class AgenteCredito implements IHandler{
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
        if (((amount*100)/prestamo) >= 25 && ((amount*100)/prestamo) <= 50){
            System.out.println("Agente de Credito: Gracias por su pago!");
            refinanciar();
        } else {
            next.criteriaHandler(amount);
        }
    }

    public void refinanciar(){
        System.out.println("Desea refinanciar su prestamo?");
    }

}
