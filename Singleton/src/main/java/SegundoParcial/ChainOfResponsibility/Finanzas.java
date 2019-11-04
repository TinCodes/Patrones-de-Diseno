package SegundoParcial.ChainOfResponsibility;

public class Finanzas implements IHandler {
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
    public void criteriaHandler(Query crit){
        if (crit.equals(Query.COSTOS)){
            System.out.println("Finanzas: Peticion de costos evaluada!\n");
        } else {
            next.criteriaHandler(crit);
        }
    }

}
