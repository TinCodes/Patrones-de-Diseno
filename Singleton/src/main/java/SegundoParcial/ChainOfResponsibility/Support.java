package SegundoParcial.ChainOfResponsibility;

public class Support implements IHandler {
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
        if (crit.equals(Query.OTROS)){
            System.out.println("Support: en que puedo ayudarle hoy?\n");
        } else {
            next.criteriaHandler(crit);
        }
    }

}
