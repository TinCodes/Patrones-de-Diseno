package ChainOfResponsibility.exercise2;

public class AgentePrestamos implements IHandler{
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
        if (((amount*100)/prestamo) == 100){
            System.out.println("Encargado de Prestamos: Gracias por su pago!");
            devolverDocs();
        } else {
            next.criteriaHandler(amount);
        }
    }

    public void devolverDocs(){
        System.out.println("Ha completado el pago de su prestamo! Sus documentos le son devueltos.");
    }

}
